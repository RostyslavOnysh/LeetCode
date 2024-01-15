package LeetCode.nextPermutation;

class Solution {
    private static final int NUMB_0 = 0;
    private static final int NUMB_1 = 1;
    private static final int NUMB_2 = 2;

    public void nextPermutation(int[] nums) {
        final int length = nums.length;
        int i = length - NUMB_2;
        while (i >= NUMB_0 && nums[i] >= nums[i + NUMB_1]) {
            i--;
        }

        if (i >= NUMB_0) {
            int j = nums.length - NUMB_1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + NUMB_1, nums.length - NUMB_1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right)
            swap(nums, left++, right--);
    }

    private static void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
