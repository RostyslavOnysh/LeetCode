package LeetCode.task_1920_Build_Array_from_Permutation;

public class Solution {
    public int[] buildArray(int[] nums) {
        int mask = 0b1111111111;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            nums[i] |= (nums[nums[i]] & mask) << 10;
        }
        for (int i = 0; i < l; i++) {
            nums[i] = nums[i] >> 10;
        }
        System.gc();
        return nums;
    }
}