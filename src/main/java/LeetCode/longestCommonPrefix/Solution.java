package LeetCode.longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            String currentWord = strs[i];
            int j = 0;
            while (j < prefix.length() && j < currentWord.length() && prefix.charAt(j) == currentWord.charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
            if (prefix.isEmpty()) {
                break;
            }
        }
        return prefix;
    }
}
