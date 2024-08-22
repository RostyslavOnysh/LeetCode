package LeetCode.task_804_Unique_Morse_Code_Words;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse  = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> uniqueMorse = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            uniqueMorse.add(sb.toString());
        }
        return uniqueMorse.size();
    }
}


/*
   String[] morse  = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<Integer> uniqueMorse = new HashSet<>();
            for (String word : words) {
              int hash = 0;
                    for (char c : word.toCharArray()) {
                        String morseCode = morse[c - 'a'];
                        for(int i = 0; i < morseCode.length();i++) {
                            hash  = 31 * hash + morseCode.charAt(i);
                        }
                    }
                uniqueMorse.add(hash);
            }
        return uniqueMorse.size();
    }
 */