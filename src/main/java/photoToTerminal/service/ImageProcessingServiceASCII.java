package photoToTerminal.service;

import java.awt.image.BufferedImage;
import java.util.Optional;

public interface ImageProcessingServiceASCII {
    String processImage(String imageUrl, int columns, int rows);
    Optional<BufferedImage> getImageFromUrl(String imageUrl);
    BufferedImage resizeImage(BufferedImage originalImage, int columns, int rows);
    String convertImageToAsciiArt(BufferedImage image, int columns, int rows);
    // char getAsciiChar(int grayValue);
}