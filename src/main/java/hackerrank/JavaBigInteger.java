package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        BigInteger firstNum = new BigInteger(num1);
        BigInteger secondNum = new BigInteger(num2);

        BigInteger add = firstNum.add(secondNum);

        BigInteger product = firstNum.multiply(secondNum);

        System.out.println(add);
        System.out.println(product);


        sc.close();
    }
}
