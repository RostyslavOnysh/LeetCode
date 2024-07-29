package LeetCode.task_1021_Remove_Outermost_Parentheses;

public class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;

        for (char c : s.toCharArray()) {
            if ((c == '(' && opened++ > 0) ||
                    (c == ')' && opened-- > 1)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

/*
class Solution {
    public boolean checkIfPangram(String sentence) {
      int allLetter = (1<<26) - 1;
      int mask = 0;

      for (char c : sentence.toCharArray()) {
        int pos = c - 'a';
        mask|= (1<<pos);
      }
      return mask == allLetter;
  }
}
 */
