package LeetCode.task_643_Maximum_Average_Subarray_I;

public class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        int maxSum = currSum;
        for (int i = k; i < n; i++) {
            currSum = currSum - nums[i - k] + nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum / k;
    }
}