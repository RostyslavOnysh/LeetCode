package LeetCode.ff;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class CatApp {
    public static void main(String[] args) {
        try {
            String imageUrl = "https://i.imgflip.com/7a5wlu.jpg";
            BufferedImage originalImage = getImageFromUrl(imageUrl);

            if (originalImage != null) {
                // Отримання розмірів екрану
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int screenWidth = (int) screenSize.getWidth();
                int screenHeight = (int) screenSize.getHeight();

// Обчислення нових розмірів зображення
                int targetWidth = (int) (screenWidth * 0.8);
                int targetHeight = (int) (screenHeight * 0.8 * ((double) originalImage.getHeight() / originalImage.getWidth()));
                BufferedImage resizedImage = resizeImage(originalImage, targetWidth, targetHeight);

                // Перетворення зменшеного зображення у ASCII-арт
                String asciiArt = convertImageToAsciiArt(resizedImage);

                // Виведення ASCII-арту в термінал
                displayAsciiArtInTerminal(asciiArt, Color.GREEN);
            } else {
                System.out.println("Не вдалося завантажити зображення.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BufferedImage getImageFromUrl(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            return ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        // Зменшення розмірів у 10 разів
        int newWidth = originalImage.getWidth();
        int newHeight = originalImage.getHeight();

        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = resizedImage.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
        graphics.dispose();
        return resizedImage;
    }

    private static String convertImageToAsciiArt(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        StringBuilder asciiArt = new StringBuilder();

        for (int y = 0; y < height; y += 6) {
            for (int x = 0; x < width; x += 3) {
                int pixel = image.getRGB(x, y);
                int gray = (int) (0.21 * ((pixel >> 16) & 0xff) + 0.72 * ((pixel >> 8) & 0xff) + 0.07 * (pixel & 0xff));
                char asciiChar = getAsciiChar(gray);
                asciiArt.append(asciiChar);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }

    private static char getAsciiChar(int grayValue) {
        char[] asciiChars = {'@', '#', '8', '&', 'o', ':', '*', '.', ' '};
        int index = (grayValue * (asciiChars.length - 1)) / 255;
        return asciiChars[asciiChars.length - 1 - index];
    }

    private static void displayAsciiArtInTerminal(String asciiArt, Color color) {
        String colorCode = String.format("\u001B[38;2;%d;%d;%dm", color.getRed(), color.getGreen(), color.getBlue());
        String resetColorCode = "\u001B[0m";
        System.out.println(colorCode + asciiArt + resetColorCode);
    }
}