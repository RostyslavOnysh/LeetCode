package hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        BitSet bs1 = new BitSet(n);
        BitSet bs2 = new BitSet(m);

        for (int i = 0; i < m; i++) {
            String[] parts = sc.nextLine().split(" ");
            String op = parts[0];

            int x = Integer.parseInt(parts[1]);
            int y = parts.length > 2 ? Integer.parseInt(parts[2]) : -1;

            switch (op) {
                case "AND":
                    if (x == 1) bs1.and(bs2);
                    else bs2.and(bs1);
                    break;
                case "OR":
                    if (x == 1) bs1.or(bs2);
                    else bs2.or(bs1);
                    break;
                case "XOR":
                    if (x == 1) bs1.xor(bs2);
                    else bs2.xor(bs1);
                    break;
                case "FLIP":
                    if (x == 1) bs1.flip(y);
                    else bs2.flip(y);
                    break;
                case "SET":
                    if (x == 1) bs1.set(y);
                    else bs2.set(y);
                    break;
            }

            System.out.println(bs1.cardinality() + " " + bs2.cardinality());
        }
        sc.close();
    }
}
