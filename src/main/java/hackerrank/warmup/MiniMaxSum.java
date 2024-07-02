package hackerrank.warmup;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
    /*  long totalSum = arr.stream().mapToLong(Long::valueOf).sum();
        long min = arr.stream().mapToLong(Long::valueOf).min().getAsLong();
        long max = arr.stream().mapToLong(Long::valueOf).max().getAsLong();

        long minSum = totalSum - max;
        long maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);
    }

     */

        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }
        long minSum = totalSum - maxValue;
        long maxSum = totalSum - minValue;
        System.out.println(minSum + " " + maxSum);
    }

}
