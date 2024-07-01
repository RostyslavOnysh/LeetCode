package hackerrank.warmup;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int value : arr) {
            if (value > 0) {
                positive++;
            }else if (value < 0) {
                negative++;
            }else {
                zero++;
            }
        }

        System.out.printf("%.6f%n", (double) positive / n);
        System.out.printf("%.6f%n", (double) negative / n);
        System.out.printf("%.6f%n", (double) zero / n);
    }
}
