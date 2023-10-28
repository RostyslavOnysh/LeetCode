package LeetCode.JumpGame2;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(jump(arr));
    }

    public static int jump(int[] nums) {
        int max = 0;
        int steps = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == steps) {
                jumps++;
                steps = max;
            }
        }
        return jumps;
    }
}
