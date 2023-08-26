package codeWars.fromTheMinumum;

import performanceCheker.Performance;
import java.util.HashSet;
import java.util.Set;

public class solution {
    public static int minValue(int[] values) {
     /*   List<Integer> deduplicatedDigits = new ArrayList<>();
        Arrays.sort(values);

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] != values[i + 1]) {
                deduplicatedDigits.add(values[i]);
            }
        }
        deduplicatedDigits.add(values[values.length - 1]);

        int result = 0;
        for (int digit : deduplicatedDigits) {
            result = result * 10 + digit;
        }
        return result;
    }


      */
        Set<Integer> deduplicatedDigits = new HashSet<>();
        for (int value : values) {
            deduplicatedDigits.add(value);
        }

        int result = 0;
        for (int digit : deduplicatedDigits) {
            result = result * 10 + digit;
        }
        return result;
    }
    public static void main(String[] args) {
        Performance.logPerformance();

        int[] digits1 = {1, 3, 1};
        System.out.println(minValue(digits1)); // Output: 13

        int[] digits2 = {5, 7, 5, 9, 7};
        System.out.println(minValue(digits2)); // Output: 579

        int[] digits3 = {1, 9, 3, 1, 7, 4, 6, 6, 7};
        System.out.println(minValue(digits3)); // Output: 134679
    }
}
