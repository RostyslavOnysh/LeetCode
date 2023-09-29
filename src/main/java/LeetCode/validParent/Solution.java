package LeetCode.validParent;

import performanceCheker.Performance;

public class Solution {

    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";

        System.out.println("Input 1 is valid: " + isValid(input1));
        System.out.println("Input 2 is valid: " + isValid(input2));
        System.out.println("Input 3 is valid: " + isValid(input3));
        Performance.logPerformance();
    }

    public static boolean isValid(String s) {
        int[] stack = new int[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = i;
            } else {
                if (top == -1) {
                    return false;
                }

                char topChar = s.charAt(stack[top]);
                if ((c == ')' && topChar != '(')
                        || (c == ']' && topChar != '[')
                        || (c == '}' && topChar != '{')) {
                    return false;
                }
                top--;
            }
        }
        return top == -1;
    }
}
