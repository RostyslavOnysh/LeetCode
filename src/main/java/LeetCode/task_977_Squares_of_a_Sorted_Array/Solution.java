package LeetCode.task_977_Squares_of_a_Sorted_Array;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result = new int [nums.length];
        int n = nums.length;

        int left = 0;
        int rigth = n - 1;
        int index = n - 1;

        while (left <= rigth) {
            int leftSqueare = nums[left] * nums[left];
            int rightSquare = nums[rigth] * nums[rigth];

            if (leftSqueare > rightSquare) {
                result[index] = leftSqueare;
                left++;
            } else {
                result[index] = rightSquare;
                rigth--;
            }
            index--;
        }
        return result;
    }
}