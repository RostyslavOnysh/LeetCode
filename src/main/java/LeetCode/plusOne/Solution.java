package LeetCode.plusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int carry = 1;

        for (int i = length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum >= 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = sum;
                carry = 0;
                break;
            }
        }
        if (carry == 1) {
            int[] result = new int[length + 1];
            result[0] = 1;
            for (int i = 1; i <= length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        } else {
            return digits;
        }
    }
}