package LeetCode.task_1004_Max_Consecutive_Ones_III;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zerosCounts = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerosCounts++;
            }

            while (zerosCounts > k) {
                if (nums[left] == 0) {
                    zerosCounts--;
                }
                left++;
            }

            int currWindow = right - left + 1;
            if (currWindow > maxLength) {
                maxLength = currWindow;
            }
        }
        return maxLength;
    }
}