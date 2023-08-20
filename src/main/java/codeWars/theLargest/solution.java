package codeWars.theLargest;

import java.util.Arrays;

public class solution {
    public static long maxNumber(long n) {
        char[] digits = Integer.toString((int) n).toCharArray();
        Arrays.sort(digits);
        StringBuilder result = new StringBuilder();
        for(int i = digits.length - 1; i >= 0; i--) {
            result.append(digits[i]);
        }
        return Integer.parseInt(result.toString());
    }
}
