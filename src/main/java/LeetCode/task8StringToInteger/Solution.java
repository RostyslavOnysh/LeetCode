package LeetCode.task8StringToInteger;

public class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int total = 0;
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (Integer.MAX_VALUE / 10 < total
                    || Integer.MAX_VALUE / 10 == total
                    && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("42")); // Output: 42
        System.out.println(solution.myAtoi("   -42")); // Output: -42
        System.out.println(solution.myAtoi("4193 with words")); // Output: 4193
    }
}
