package codeWars;

public class CenturyFromYear {
    public static int century(int number) {
        int century = (int) Math.ceil(number / 100.0);
        return century;
    }
}
