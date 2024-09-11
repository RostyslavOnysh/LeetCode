package LeetCode.task_54_Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int upperBound = 0, leftBound = 0;
        int lowerBound = matrix.length - 1;
        int rightBound = matrix[0].length - 1;

        while (upperBound <= lowerBound && leftBound <= rightBound) {
            for (int i = leftBound; i <= rightBound; i++) {
                res.add(matrix[upperBound][i]);
            }
            upperBound++;

            for (int u = upperBound; u <= lowerBound; u++) {
                res.add(matrix[u][rightBound]);
            }
            rightBound--;

            if (upperBound <= lowerBound) {
                for (int l = rightBound; l >= leftBound; l--) {
                    res.add(matrix[lowerBound][l]);
                }
                lowerBound--;
            }
            if (leftBound <= rightBound) {
                for (int u = lowerBound; u >= upperBound; u--) {
                    res.add(matrix[u][leftBound]);
                }
                leftBound++;
            }
        }
        return res;
    }
}