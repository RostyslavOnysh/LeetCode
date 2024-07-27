package LeetCode.task_1614._Maximum_Nesting_Depth_of_the_Parentheses;

public class Solution {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                currentDepth++;
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            } else if (s.charAt(i) == ')') {
                currentDepth--;
            }
        }
        return currentDepth;
    }
}
