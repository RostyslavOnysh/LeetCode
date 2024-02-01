package photoToTerminal;

import photoToTerminal.exception.ImageLoadException;
import photoToTerminal.exception.InvalidUrlException;
import photoToTerminal.service.AsciiArtDisplayService;
import photoToTerminal.service.AsciiArtDisplayServiceImpl;
import photoToTerminal.service.ImageProcessingServiceASCII;
import photoToTerminal.service.ImageProcessingServiceASCIIImpl;

public class CatApp {
    private static final String URL = "https://i1.sndcdn.com/artworks-fo26rCmh6bzz9LOL-9xFwLA-t500x500.jpg";
    private final ImageProcessingServiceASCII imageProcessingService;
    private final AsciiArtDisplayService asciiArtDisplayService;

    public CatApp(ImageProcessingServiceASCII imageProcessingService, AsciiArtDisplayService asciiArtDisplayService) {
        this.imageProcessingService = imageProcessingService;
        this.asciiArtDisplayService = asciiArtDisplayService;
    }

    public static void main(String[] args) {
        ImageProcessingServiceASCII imageProcessingService = new ImageProcessingServiceASCIIImpl();
        AsciiArtDisplayService asciiArtDisplayService = new AsciiArtDisplayServiceImpl();

        CatApp catApp = new CatApp(imageProcessingService, asciiArtDisplayService);
        catApp.processImage();
    }

    private void processImage() {
        try {
            String asciiArt = imageProcessingService.processImage(URL, 500, 500);
            asciiArtDisplayService.displayAsciiArtInTerminal(asciiArt);
        } catch (InvalidUrlException e) {
            throw new InvalidUrlException("Error processing image: " + e.getMessage());
        } catch (ImageLoadException e) {
            throw new ImageLoadException("Error processing image: " + e.getMessage(), e);
        }
    }
}
