package LeetCode.task_413_Arithmetic_Slices;

public class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int res = 0;
        int curr = 0;

        if (n < 3) {
            return 0;
        }

        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr += 1;
                res += curr;
            } else {
                curr = 0;
            }
        }
        return res;
    }
}
