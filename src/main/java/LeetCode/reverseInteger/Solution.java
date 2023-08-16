package LeetCode.reverseInteger;

public class Solution {
    public int reverse(int x) {
        int reversed = 0;
        for (; x != 0; x /= 10) {
            int digit = x % 10;
            if ((reversed * 10 + digit - digit) / 10 != reversed) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
