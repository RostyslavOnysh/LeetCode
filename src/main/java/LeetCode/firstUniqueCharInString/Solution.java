package LeetCode.firstUniqueCharInString;

import java.util.Hashtable;

public class Solution {
    public int firstUniqChar(String s) {
            Hashtable<Character, Integer> charCount = new Hashtable<>();

            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return i;
            }
        }
        return 1;
    }
}
