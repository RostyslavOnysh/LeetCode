package LeetCode.task_1678_Goal_Parser_Interpretation;

public class Solution {
    public String interpreter (String command) {
//   return command.replace("(al)", "al").replace("()", "o");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
                i++;
            } else if (command.charAt(i) == '(' && command.startsWith("(al)", i)) {
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();
    }
}
