package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int query = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < query; i++) {
            String str = sc.next();
            if (str.equals("Insert")) {
                int index = sc.nextInt();
                int element = sc.nextInt();
                list.add(index, element);
            } else if (str.equals("Delete")) {
                int ind = sc.nextInt();
                list.remove(ind);

            }
        }
        for (int s : list) {
            System.out.print(s + " ");
        }
    }
}