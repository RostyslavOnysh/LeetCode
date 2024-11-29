package LeetCode.task_241_Different_Ways_to_Add_Parentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return helper(expression, new HashMap<>());
    }

    private List<Integer> helper(String expression, Map<String, List<Integer>> memo) {
        if (memo.containsKey(expression)) {
            return memo.get(expression);
        }

        List<Integer> results = new ArrayList<>();

        if (!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            results.add(Integer.parseInt(expression));
            return results;
        }

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftPart = expression.substring(0, i);
                String rightPart = expression.substring(i + 1);
                List<Integer> leftResults = helper(leftPart, memo);
                List<Integer> rightResults = helper(rightPart, memo);
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        int result = 0;
                        if (c == '+') {
                            result = left + right;
                        } else if (c == '-') {
                            result = left - right;
                        } else if (c == '*') {
                            result = left * right;
                        }
                        results.add(result);
                    }
                }
            }
        }
        memo.put(expression, results);
        return results;
    }
}
