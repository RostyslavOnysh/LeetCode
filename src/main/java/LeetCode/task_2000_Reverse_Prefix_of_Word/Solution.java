package LeetCode.task_2000_Reverse_Prefix_of_Word;

import java.util.Stack;

public class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int index = 0;

        while (index < word.length()) {
            stack.push(word.charAt(index));

            if (word.charAt(index) == ch) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                index++;
            }
            while (index < word.length()) {
                sb.append(word.charAt(index));
                index++;
            }
            return sb.toString();
        }
        index++;
        return word;
    }
}