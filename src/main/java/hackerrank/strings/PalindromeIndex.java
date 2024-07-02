package hackerrank.strings;

public class PalindromeIndex {

    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // Check if removing s.charAt(left) makes the rest a palindrome
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }
                // Check if removing s.charAt(right) makes the rest a palindrome
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }
                // If neither makes it a palindrome, return -1
                return -1;
            }
        }

        // The string is already a palindrome
        return -1;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
