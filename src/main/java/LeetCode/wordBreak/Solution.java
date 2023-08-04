package LeetCode.wordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        int maxLen = 0;
        for (String word : wordDict) {
            maxLen = Math.max(maxLen, word.length());
        }

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        Set<String> wordSet = new HashSet<>(wordDict);

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 0 && i - j <= maxLen; j--) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Solution wordBreak = new Solution();

        String s1 = "leetcode";
        List<String> wordDict1 = List.of("leet", "code");
        System.out.println(wordBreak.wordBreak(s1, wordDict1)); // Виведе: true

        String s2 = "applepenapple";
        List<String> wordDict2 = List.of("apple", "pen");
        System.out.println(wordBreak.wordBreak(s2, wordDict2)); // Виведе: true

        String s3 = "catsandog";
        List<String> wordDict3 = List.of("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak.wordBreak(s3, wordDict3)); // Виведе: false
    }
}