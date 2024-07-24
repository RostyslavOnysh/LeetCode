package LeetCode.task_2325_Decode_the_Message;

import java.util.HashMap;

public class Solution {
    public String decodeMessage(String key, String message) {
        char[] kChar = key.toCharArray();
        char[] mChar = message.toCharArray();
        char[] map = new char[123];
        map[' '] = ' ';
        for (int i = 0, ptr = 'a'; i < kChar.length && ptr <= 'z'; i++) {
            if (map[kChar[i]] == 0) {
                map[kChar[i]] = (char) ptr++;
            }
        }

        for (int j = 0; j < mChar.length; j++) {
            mChar[j] = map[mChar[j]];
        }
        return String.valueOf(mChar);
    }
}


/*
     StringBuilder sb = new StringBuilder();
        key = key.replace(" ", "");
        HashMap<Character, Character> letters = new HashMap<>();

        char origin = 'a';

        for (int i = 0; i < key.length(); i++) {
            if (!letters.containsKey(key.charAt(i))) {
                letters.put(key.charAt(i), origin++);
            }
        }


        for (int i = 0; i < message.length(); i++) {
            if (letters.containsKey(message.charAt(i))) {
                sb.append(letters.get(message.charAt(i)));
            } else {
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
 */