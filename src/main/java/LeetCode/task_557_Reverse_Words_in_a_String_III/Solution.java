package LeetCode.task_557_Reverse_Words_in_a_String_III;

public class Solution {
    public String reverseWords(String s) {
        char[] array = s.toCharArray();
        int start = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ' || i == array.length - 1) {
                int end = (array[i] == ' ') ? i - 1 : i;

                while (start < end) {
                    char temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;
                    start++;
                    end--;
                }
                start = i + 1;
            }
        }
        return new String(array);
    }
}