package hackerrank;

import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int[] remainderFreq = new int[k];
        for (int i = 0; i < n; i++) {
            int remainder = ar.get(i) % k;
            int needed = (k - remainder) % k;
            count += remainderFreq[needed];
            remainderFreq[remainder]++;
        }
        return count;

    }
}
