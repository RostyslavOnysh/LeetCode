package photoToTerminal.service;

import photoToTerminal.exception.InvalidInputException;

import java.awt.*;

public class AsciiArtDisplayServiceImpl implements AsciiArtDisplayService {

    private static final Color DEFAULT_COLOR = Color.MAGENTA;

    @Override
    public void displayAsciiArtInTerminal(String asciiArt) {
        try {
            validateInput(asciiArt);
            String colorCode = String.format("\u001B[38;2;%d;%d;%dm", DEFAULT_COLOR.getRed(), DEFAULT_COLOR.getGreen(), DEFAULT_COLOR.getBlue());
            String resetColorCode = "\u001B[0m";
            System.out.println(colorCode + asciiArt + resetColorCode);
        } catch (InvalidInputException e) {
            System.err.println("Error displaying ASCII art: " + e.getMessage());
        }
    }

    @Override
    public void validateInput(String asciiArt) throws InvalidInputException {
        if (asciiArt == null || DEFAULT_COLOR == null) {
            throw new InvalidInputException("Invalid input for displayAsciiArtInTerminal");
        }
    }
}
