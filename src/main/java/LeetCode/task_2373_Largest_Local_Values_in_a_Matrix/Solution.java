package LeetCode.task_2373_Largest_Local_Values_in_a_Matrix;

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int size = grid.length;
        int[][] maxLocal = new int[size - 2][size - 2];

        for (int i = 0; i < size - 2; i++) {
            for (int j = 0; j < size - 2; j++) {
                int maxVal = Integer.MIN_VALUE;

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        maxVal = Math.max(maxVal, grid[x][y]);
                    }
                }
                maxLocal[i][j] = maxVal;
            }
        }
        return maxLocal;
    }
}
