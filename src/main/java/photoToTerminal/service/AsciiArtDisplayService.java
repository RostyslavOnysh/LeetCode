package photoToTerminal.service;

import photoToTerminal.exception.InvalidInputException;

public interface AsciiArtDisplayService {
    void displayAsciiArtInTerminal(String asciiArt);
    void validateInput(String asciiArt) throws InvalidInputException;
}
