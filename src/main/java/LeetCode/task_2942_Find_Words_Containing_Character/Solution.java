package LeetCode.task_2942_Find_Words_Containing_Character;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                res.add(i);
            }
        }
        return res;
    }
}


     /*   List<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (containsCharacter(words[i], c)) {
                result.add(i);
            }
        }
        return result;

    }


    private boolean containsCharacter(String word, char c) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

}


      */