package codeWars.extractFileName;

public class solution {
    public static String extractFileName(String dirtyFileName) {
        int startIndex = dirtyFileName.indexOf('_') + 1;
        int lastDotIndex = dirtyFileName.lastIndexOf('.');

        return (startIndex > 0 && lastDotIndex > startIndex)
                ? dirtyFileName.substring(startIndex, lastDotIndex)
                : "No match found.";
    }
}