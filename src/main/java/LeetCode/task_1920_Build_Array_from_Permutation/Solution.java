package LeetCode.task_1920_Build_Array_from_Permutation;

public class Solution {
    public int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
