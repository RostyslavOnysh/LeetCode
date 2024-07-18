package LeetCode.task_2000_Reverse_Prefix_of_Word;

import java.util.Stack;

public class Solution {
    public String reversePrefix(String word, char ch) {
        int left = 0;
        char [] result = word.toCharArray();

        for (int right = 0; right < word.length(); right++) {
            if (result[right] == ch) {
                while (left <= right) {
                    swap(result, left, right);
                    left++;
                    right--;
                }
                return new String(result);
            }
        }
        return word;
    }

    private void swap (char [] chars, int index1, int index2) {
        char temp = chars[index2];
        chars[index2] = chars[index1];
        chars[index1] = temp;
    }
}
       /* Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < word.length()) {
            stack.push(word.charAt(index));
            if (word.charAt(index) == ch) {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                index++;
                while (index < word.length()) {
                    result.append(word.charAt(index));
                    index++;
                }
                return result.toString();
            }
            index++;
        }
        return word;
    }
}

        */