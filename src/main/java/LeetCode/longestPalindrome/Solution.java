package LeetCode.longestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int left = i;
            int right = i;
            while (left >= 0 && s.charAt(left) == c)
                left--;
            while (right < s.length() && s.charAt(right) == c) right++;
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) != s.charAt(right)) break;
                left--;
                right++;
            }
            left += 1;
            start = (end - start < right - left) ? left : start;
            end = (end - start < right - left) ? right : end;
        }
        return s.substring(start, end);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Testsf cases
        String input1 = "babad";
        String result1 = solution.longestPalindrome(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + result1);

        String input2 = "cbbd";
        String result2 = solution.longestPalindrome(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + result2);
    }
}


