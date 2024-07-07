package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
    }

    private static boolean isBalanced (String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
            else if (ch == ']')  {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}



