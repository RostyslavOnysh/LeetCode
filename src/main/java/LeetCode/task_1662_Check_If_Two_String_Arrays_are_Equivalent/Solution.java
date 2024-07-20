package LeetCode.task_1662_Check_If_Two_String_Arrays_are_Equivalent;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character> result1 = new ArrayList<>();

        for (String s : word1) {
            for (char c : s.toCharArray()) {
                result1.add(c);
            }
        }

        List<Character> result2 = new ArrayList<>();

        for (String s2 : word2 ) {
            for (char c2 : s2.toCharArray()) {
                result2.add(c2);
            }
        }

        if (result1.size() != result2.size()) {
            return false;
        }

        for (int i = 0; i < result1.size(); i++) {
            if (result1.get(i) != result2.get(i)) {
                return false;
            }
        }
        return true;
    }
}

    }
    /*    StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            result1.append(word1[i]);
        }

        for (int j = 0; j < word2.length; j++) {
            result2.append(word2[j]);
        }

        return result1.toString().equals(result2.toString());
    }
}


     */

// return (String.join("", word1)).equals(String.join("", word2));