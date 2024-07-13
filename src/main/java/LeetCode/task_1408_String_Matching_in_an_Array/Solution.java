package LeetCode.task_1408_String_Matching_in_an_Array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
}

/*
   Set<String> resultSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].indexOf(words[i]) != -1) {
                    resultSet.add(words[i]);
                    break; // Once found as a substring, no need to check further
                }
            }
        }

        return new ArrayList<>(resultSet);
    }
 */