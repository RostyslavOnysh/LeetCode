package hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparetheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
       int aliceScore = 0;
       int bobScore = 0;

       for (int i = 0; i < 3; i++) {
           if (a.get(i) > b.get(i)) {
               aliceScore++;
           } else if(a.get(i) < b.get(i)) {
               bobScore++;
           }
       }
        return Arrays.asList(aliceScore,bobScore);
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(5, 6, 7);
        List<Integer> b = List.of(3, 6, 10);
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result); // Output the result
    }
}
