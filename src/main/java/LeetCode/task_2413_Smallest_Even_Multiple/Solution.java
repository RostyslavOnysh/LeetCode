package LeetCode.task_2413_Smallest_Even_Multiple;

public class Solution {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}
