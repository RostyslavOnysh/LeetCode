package LeetCode.task_151_Reverse_Words_in_a_String;

class Solution {
    public String reverseWords(String s) {
        String [] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}