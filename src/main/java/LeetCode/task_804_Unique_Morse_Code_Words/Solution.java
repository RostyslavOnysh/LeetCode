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
