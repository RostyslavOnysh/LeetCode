package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            try {
                System.out.println(lines.get(x).get(y));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}