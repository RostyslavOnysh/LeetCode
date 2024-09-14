package LeetCode.task_1189_Maximum_Number_of_Balloons;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> res = new HashMap<>();

        for (char c : text.toCharArray()) {
            res.put(c, res.getOrDefault(c,0) + 1);
        }

        Map<Character, Integer> ballounLetters = new HashMap<>();
        ballounLetters.put('b', 1);
        ballounLetters.put('a', 1);
        ballounLetters.put('l', 2);
        ballounLetters.put('o', 2);
        ballounLetters.put('n', 1);

        int count = Integer.MAX_VALUE;

        for (Map.Entry<Character,Integer> entry : ballounLetters.entrySet()) {
            char c = entry.getKey();
            int req = entry.getValue();
            int aval = res.getOrDefault(c, 0);
            int poss = aval / req;

            count = Math.min(count, poss);
        }
        return count;
    }
}
