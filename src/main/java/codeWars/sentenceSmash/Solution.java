package codeWars.sentenceSmash;

public class Solution {
    public static String smash(String... words) {
        StringBuilder sentence = new StringBuilder();

        for (String word : words) {
            sentence.append(word).append(" ");
        }
        String result = sentence.toString().replaceAll(",", "");

        return result.trim();
    }
}


/*
  return String.join(" ", words).replaceAll(",", "");
 */