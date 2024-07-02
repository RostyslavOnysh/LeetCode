package hackerrank.warmup;

import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long value : ar) {
            sum += value;
        }
        return sum;
    }
}
