package LeetCode.addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length()) + 1;
        char[] sum = new char[maxLength];
        int carry = 0;
        int index = maxLength - 1;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int aDigit = i >= 0 ? a.charAt(i) - '0' : 0;
            int bDigit = j >= 0 ? b.charAt(j) - '0' : 0;
            int digitSum = aDigit + bDigit + carry;
            carry = digitSum / 2;
            sum[index--] = (char) ('0' + (digitSum % 2));
        }
        if (carry > 0) {
            sum[index--] = '1';
        }
        return new String(sum, index + 1, maxLength - index - 1);
    }
}


