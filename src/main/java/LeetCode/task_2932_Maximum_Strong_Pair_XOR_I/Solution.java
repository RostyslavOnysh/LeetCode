package LeetCode.task_2932_Maximum_Strong_Pair_XOR_I;

public class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int currXOR = nums[i] ^ nums[j];
                res = Math.max(res, currXOR);
            }
        }
        return res;
    }
}
