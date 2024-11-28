package LeetCode.task_71_Simplify_Path;

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        if (path == null || path.isEmpty()) {
            return "/";
        }

        String[] segments = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String segment : segments) {
            if (segment.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!segment.isEmpty() && !segment.equals(".")) {
                stack.push(segment);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.length() > 0 ? result.toString() : "/";
    }
}
