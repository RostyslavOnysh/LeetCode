package LeetCode.task_Result_643_Maximum_Average_Subarray_I;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }

        double  maxSum = currSum;
        int left = 0;

        for (int rigth = k; rigth < nums.length; rigth++) {
            currSum += nums[rigth] - nums[left];
            maxSum = Math.max(maxSum, currSum);
            left++;
        }
        return maxSum / k;
    }
}