package LeetCode.task_2760_Longest_Even_Odd_Subarray_With_Threshold;

public class Solution {
    public int longestSubarray(int[] nums, int threshold) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int length = 1;
                boolean isEven = true;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > threshold || (nums[j] % 2 == 0) == isEven) {
                        break;
                    }
                    length++;
                    isEven = !isEven;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}

