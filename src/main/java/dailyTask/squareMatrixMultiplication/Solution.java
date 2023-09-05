package dailyTask.squareMatrixMultiplication;

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;


public class Solution {
    public static int[][] multiplySquareMatrices(int[][] a, int[][] b) {
        int length = a.length;
        int[][] newMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = 0;
                for (int k = 0; k < length; k++) {
                    sum += a[i][k] * b[k][j];
                }
                newMatrix[i][j] = sum;
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 2}};
        int[][] B = {{3, 2}, {1, 1}};

        int[][] result = multiplySquareMatrices(A, B);

        // Виведення результату
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}