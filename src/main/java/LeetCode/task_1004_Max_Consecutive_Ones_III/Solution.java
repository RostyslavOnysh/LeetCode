package LeetCode.task_1004_Max_Consecutive_Ones_III;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxOne = 0;
        int maxZero = 0;

        for (int rigth = 0; rigth < nums.length; rigth++) {
            if (nums[rigth] == 0) {
                maxZero++;
            }

            while (maxZero > k) {
                if (nums[left] == 0) {
                    maxZero--;
                }
                left++;
            }
            maxOne = Math.max(maxOne, rigth - left+1);
        }
        return maxOne;
    }
}