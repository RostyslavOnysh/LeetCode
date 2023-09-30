package LeetCode.sqrtX;

public class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        long left = 1;
        long right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sqrt = mid * mid;

            if (sqrt == x) {
                return (int) mid;
            } else if (sqrt < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}
