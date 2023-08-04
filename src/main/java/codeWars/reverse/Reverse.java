package codeWars.reverse;

public class Reverse {
    public static String reverseWords(final String original) {
        StringBuilder sb = new StringBuilder(original);
        return sb.reverse().toString();
    }
}

