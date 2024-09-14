package LeetCode.task_383_Ransom_Note;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> res = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            res.put(c, res.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!res.containsKey(c) || res.get(c) == 0) {
                return false;
            }
            res.put(c,res.get(c) - 1);
        }
        return true;
    }
}