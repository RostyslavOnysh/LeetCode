package LeetCode.task_283_Move_Zeroes;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }


    public static void moveZeroes(int[] nums) {
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[target];
                nums[target] = temp;
                target++;
            }
        }
    }
}
