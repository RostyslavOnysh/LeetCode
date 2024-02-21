package LeetCode.task268MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // and we can use garbage collector System.gc();
        return expectedSum - actualSum;
    }
}
