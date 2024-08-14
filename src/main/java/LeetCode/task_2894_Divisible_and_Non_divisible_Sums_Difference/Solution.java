package LeetCode.task_2894_Divisible_and_Non_divisible_Sums_Difference;

public class Solution {
    public int differenceOfSums(int n, int m) {
        return n * (n + 1) / 2 - (1 + n / m) * (n / m) * m;
    }
}
