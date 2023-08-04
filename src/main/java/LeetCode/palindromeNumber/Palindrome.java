package LeetCode.palindromeNumber;

public class Palindrome {
    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println(isPalindrome(x1)); // Output: true
        System.out.println(isPalindrome(x2)); // Output: false
        System.out.println(isPalindrome(x3)); // Output: false
    }

    public static boolean isPalindrome(int x) {
     if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == reversedNumber || x == reversedNumber / 10;
    }
}
