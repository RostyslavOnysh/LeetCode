package LeetCode.task_1365._How_Many_Numbers_Are_Smaller_Than_the_Current_Number;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }

            }
            res[i] = count;
        }
        return res;

    }
}