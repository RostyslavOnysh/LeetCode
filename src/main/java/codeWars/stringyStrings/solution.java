package codeWars.stringyStrings;

public class solution {
    public static String stringy(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(i % 2 == 0 ? '1' : '0');
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(stringy(5));
    }
}


