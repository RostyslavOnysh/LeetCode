package hackerrank.strings;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        int left = 0;
        int right = A.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (A.charAt(left) != A.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}