package LeetCode.task_242_Valid_anagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            freq[index] += 1;
        }
        for (char ch : t.toCharArray()) {
            int index = ch - 'a';
            freq[index] -= 1;
        }
        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

