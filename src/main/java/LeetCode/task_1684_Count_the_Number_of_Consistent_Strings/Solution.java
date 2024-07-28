package LeetCode.task_1684_Count_the_Number_of_Consistent_Strings;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;

        for (String word : words) {
            int count = 0;
            for (char c : word.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                result++;
            }
        }
        return result;
    }
}
   /*     int result = words.length;
        Set<Character> allowedChars = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            allowedChars.add(c);
        }

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (!allowedChars.contains(c)) {
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}

    */