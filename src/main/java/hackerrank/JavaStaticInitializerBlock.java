package hackerrank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int B = 0;
    static int C = 0;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        C = sc.nextInt();
        sc.close();
        if (B > 0 && C > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if (flag) {
            int area = B * C;
            System.out.println(area);
        }
    }
}
