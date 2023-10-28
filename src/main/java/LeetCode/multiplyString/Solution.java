package LeetCode.multiplyString;

public class Solution {

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        String result = multiply(num1, num2);

        System.out.println("Result: " + result);
    }

    public static String multiply(String num1, String num2) {
        String reversedNum1 = new StringBuilder(num1).reverse().toString();
        String reversedNum2 = new StringBuilder(num2).reverse().toString();

        int m = reversedNum1.length();
        int n = reversedNum2.length();
        int[] result = new int[m + n];
        boolean nonZeroAppended = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int product = (reversedNum1.charAt(i) - '0') * (reversedNum2.charAt(j) - '0');
                int sum = product + result[i + j];
                result[i + j] = sum % 10;
                result[i + j + 1] += sum / 10;
                if (sum != 0) {
                    nonZeroAppended = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder(m + n);
        for (int i = m + n - 1; i >= 0; i--) {
            sb.append(result[i]);
        }
        return nonZeroAppended ? sb.toString() : "0";
    }
}
