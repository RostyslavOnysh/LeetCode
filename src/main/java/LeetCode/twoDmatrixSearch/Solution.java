package LeetCode.twoDmatrixSearch;

import static performanceCheker.Performance.logPerformance;

public class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0;
        int col = matrix[0].length - 1;

        while (rows < matrix.length && col >= 0) {

            if (matrix[rows][col] == target) {
                return true;
            }
            if (matrix[rows][col] < target) {
                rows++;
            } else col--;
        }
        return false;
    }
}

 /*   public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target1 = 5;
        int target2 = 20;
        logPerformance();
        // Call the searchMatrix method to search for target1
        boolean found1 = searchMatrix(matrix, target1);
        System.out.println("Target 1 found: " + found1); // Should print "Target 1 found: true"

        // Call the searchMatrix method to search for target2
        boolean found2 = searchMatrix(matrix, target2);
        System.out.println("Target 2 found: " + found2); // Should print "Target 2 found: false"
        logPerformance();
    }
}


  */