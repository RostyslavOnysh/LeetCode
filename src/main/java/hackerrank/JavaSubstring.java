package hackerrank;

import java.util.Scanner;

public class JavaSubstring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i < s.length() - k; i++) {
            String subsStr = s.substring(i, i + k);
            if (subsStr.compareTo(smallest) < 0) {
                smallest = subsStr;
            }
            if (subsStr.compareTo(largest) > 0) {
                largest = subsStr;
            }
        }

        return smallest + "\n" + largest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }

}
