package LeetCode.longesrSubsrtWuthiotReapitChar;

public class BestPractice {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[128];

        for (int start = 0, end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            start = Math.max(start, lastIndex[currentChar]);
            maxLength = Math.max(maxLength, end - start + 1);
            lastIndex[currentChar] = end + 1;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        BestPractice checker = new BestPractice();
        String input = "abcabcbb";
        int result = checker.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}


