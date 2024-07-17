package LeetCode.task_2114_Maximum_Number_of_Words_Found_in_Sentences;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;

        for (String s : sentences) {
            int currLength = s.split(" ").length;
            if (maxLength < currLength) {
                maxLength = currLength;
            }
        }
        return maxLength;
    }
}


  /*

    public int countWords(String s) {
    int sumOfWords = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sumOfWords++;
            }
        }
        return sumOfWords;
    }


    public int mostWordsFounded(String[] sentences) {
        int maxWords = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            maxWords = Math.max(maxWords, countWords(sentences[i]));
        }
        return maxWords;
    }
}


   */