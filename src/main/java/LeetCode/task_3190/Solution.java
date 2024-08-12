package LeetCode.task_3190;

public class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;

        int result = 0;
        for (int num : nums) {
            result += num % 3 == 0 ? 0 : 1;
        }
        return result;
    }
}