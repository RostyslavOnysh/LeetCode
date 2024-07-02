package hackerrank.warmup;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {

      /*  int sum = 0;
        for (int value : ar) {
            sum += value;
        }


       */
        return ar.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(1, 2, 3, 4, 10, 11);
        int result = simpleArraySum(array);
        System.out.println(result); // Output the result
    }
}
