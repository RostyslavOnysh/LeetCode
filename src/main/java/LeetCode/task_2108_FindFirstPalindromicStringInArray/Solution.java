package LeetCode.task_2108_FindFirstPalindromicStringInArray;

public class Solution {
    private static final byte MAX_WORD_LENGTH = 100;
    private static final byte ZERO = 0;

    public static void main(String[] args) {
        String word = "madam";
        boolean isPalindrome = isPalindrome(word);
        System.out.println(isPalindrome);
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        System.gc();
        return "";
    }

    private static boolean isPalindrome(String word) {
        int first = ZERO;
        int last = Math.min(word.length() - 1, MAX_WORD_LENGTH);
        while (first <= last) {
            if (word.charAt(first) != word.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
