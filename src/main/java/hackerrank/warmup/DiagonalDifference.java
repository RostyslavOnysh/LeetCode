package hackerrank.warmup;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
       int arrSize = arr.size();
       int leftDiag = 0;
       int rightDiag = 0;

       for (int i = 0; i < arrSize; i++) {
           leftDiag += arr.get(i).get(i);
           rightDiag += arr.get(i).get(arrSize - 1 - i);
       }
       return Math.abs(leftDiag - rightDiag);
    }

    public static void main(String[] args) {
        // Example usage
        List<List<Integer>> arr = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        );

        int result = diagonalDifference(arr);
        System.out.println(result); // Output: 15
    }
}
