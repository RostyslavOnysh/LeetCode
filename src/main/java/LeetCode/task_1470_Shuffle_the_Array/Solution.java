package LeetCode.task_1470_Shuffle_the_Array;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i = 0; i < n; i++)  {
            nums[i] = (nums[i] << 10) | nums[i + n];
        }

        for (int i = n - 1; i >= 0; i--) {
            int x = nums[i] >> 10;
            int y = nums[i] & 0x3FF;

            nums[2 * i] = x;
            nums[2 * i + 1] = y;
        }

        System.gc();
        return nums;
    }
}


// Use two pointers to create the new array of 2n elements.
// The first starting at the beginning and the other starting at (n+1)th position. Alternate between them and create the new array.