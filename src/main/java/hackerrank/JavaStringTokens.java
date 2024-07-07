package hackerrank;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] tokens = s.split("[^A-Za-z]+");

        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}

