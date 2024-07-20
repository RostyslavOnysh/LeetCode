package LeetCode.task_1816._Truncate_Sentence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String s = "Meow bombastic shit abogus or amogus lol";
        int k = 3;
        System.out.println(truncateSentence(s, k));
    }


    public static String truncateSentence(String s, int k) {
        String [] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(arr[i]).append(" ");
        }

        sb.setLength(sb.length() - 1);
        return sb.toString();

    }
}

        /*List<Character> result = new ArrayList<>();
        StringBuilder words = new StringBuilder();
        int wordCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                wordCount++;
                if (wordCount == k) {
                    break;
                }
            }
            result.add(c);
        }
        for (char c2 : result) {
            words.append(c2);
        }
        return words.toString();
    }
}


         */