package LeetCode.longesrSubsrtWuthiotReapitChar;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int longestSubstring = 0;
        int windowStart = 0, windowEnd = 0;

        while (windowEnd < s.length()) {
            if (!charSet.contains(s.charAt(windowEnd))) {
                charSet.add(s.charAt(windowEnd));
                longestSubstring = Math.max(longestSubstring, windowEnd - windowStart + 1);
                windowEnd++;
            } else {
                charSet.remove(s.charAt(windowStart));
                windowStart++;
            }
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }

}
