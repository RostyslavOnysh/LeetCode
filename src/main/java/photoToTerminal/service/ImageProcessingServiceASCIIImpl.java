package photoToTerminal.service;

import photoToTerminal.exception.ImageLoadException;
import photoToTerminal.exception.InvalidUrlException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Optional;

public class ImageProcessingServiceASCIIImpl implements ImageProcessingServiceASCII {

    private static final char[] ASCII_CHARS = {
            '@', '#', '8', '&', 'o', ':', '*', '.', ' '
    };

    @Override
    public String processImage(String imageUrl, int columns, int rows) {
        BufferedImage originalImage = getImageFromUrl(imageUrl)
                .orElseThrow(() -> new RuntimeException("Failed to load the image."));

        BufferedImage resizedImage = resizeImage(originalImage, columns, rows);
        return convertImageToAsciiArt(resizedImage, columns, rows);
    }

    @Override
    public Optional<BufferedImage> getImageFromUrl(String imageUrl) {
        return getBufferedImage(imageUrl);
    }


    public static Optional<BufferedImage> getBufferedImage(String imageUrl) {
        if (imageUrl == null || imageUrl.trim().isEmpty()) {
            throw new InvalidUrlException("Invalid URL");
        }

        try {
            URL url = new URI(imageUrl).toURL();
            try (InputStream inputStream = url.openStream()) {
                return Optional.ofNullable(Optional.ofNullable(ImageIO.read(inputStream))
                        .orElseThrow(() -> new ImageLoadException("Failed to load the image.")));
            }
        } catch (IOException | URISyntaxException e) {
            throw new InvalidUrlException("Error processing URL");
        }
    }

    @Override
    public BufferedImage resizeImage(BufferedImage originalImage, int columns, int rows) {
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        // Calculate the scale factor
        double scaleFactor = Math.min((double) width / columns, (double) height / rows);

        // Create a new image with the desired dimensions
        int scaledWidth = (int) (width / scaleFactor);
        int scaledHeight = (int) (height / scaleFactor);

        BufferedImage resizedImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);

        // Create a graphics object for the resized image
        Graphics2D graphics = resizedImage.createGraphics();

        // Set the interpolation method
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        // Scale the image
        graphics.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);

        // Dispose of the graphics object
        graphics.dispose();

        return resizedImage;
    }


 /*   public String convertImageToAsciiArt(BufferedImage image, int columns, int rows) {
        int width = image.getWidth();
        int height = image.getHeight();

        int[] grayscale = new int[width * height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int pixel = image.getRGB(x, y);
                grayscale[x + y * width] = (int) (0.21 * ((pixel >> 16) & 0xff) + 0.72 * ((pixel >> 8) & 0xff) + 0.07 * (pixel & 0xff));
            }
        }

        float scale = Math.min(1.0f, (float) width / columns);
        int xStep = Math.round(scale);
        int yStep = Math.round(scale);

        StringBuilder asciiArt = new StringBuilder();
        for (int y = 0; y < height; y += yStep) {
            for (int x = 0; x < width; x += xStep) {
                int index = grayscale[x + y * width] * (ASCII_CHARS.length - 1) / 255;
                asciiArt.append(ASCII_CHARS[index]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }

  */

    @Override
    public String convertImageToAsciiArt(BufferedImage image, int columns, int rows) {
        int width = image.getWidth();
        int height = image.getHeight();
        int[] grayscale = calculateGrayscale(image);

        float scale = Math.min(1.0f, (float) width / columns);
        int xStep = Math.round(scale);
        int yStep = Math.round(scale);

        StringBuilder asciiArt = new StringBuilder();
        for (int y = 0; y < height; y += yStep) {
            for (int x = 0; x < width; x += xStep) {
                int index = grayscale[x + y * width] * (ASCII_CHARS.length - 1) / 255;
                asciiArt.append(ASCII_CHARS[index]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }

    private int[] calculateGrayscale(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        int[] grayscale = new int[width * height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int pixel = image.getRGB(x, y);
                grayscale[x + y * width] = (int) (0.21 * ((pixel >> 16) & 0xff) + 0.72 * ((pixel >> 8) & 0xff) + 0.07 * (pixel & 0xff));
            }
        }

        return grayscale;
    }
}
