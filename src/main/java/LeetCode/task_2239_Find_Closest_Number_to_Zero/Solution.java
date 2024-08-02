package LeetCode.task_2239_Find_Closest_Number_to_Zero;

public class Solution {
    public int findClosestNumber(int[] nums) {
        int res = Integer.MAX_VALUE;

        for (int num : nums) {
            if (Math.abs(num) <= Math.abs(res) && Math.abs(num) != res) {
                res = num;
            }
        }
        return res;
    }
}
