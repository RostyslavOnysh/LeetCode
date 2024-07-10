package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(sc.nextInt());
        }

        int query = sc.nextInt();  // query numb
        sc.nextLine(); // consume the newline char

        for (int i = 0; i < query; i++) {
            String queryType = sc.nextLine();

            if (queryType.equals("Insert")) {
                int index = sc.nextInt();
                int line = sc.nextInt();
                sc.nextLine();
                result.add(index,line);
            }else if (queryType.equals("Delete")) {
                int index = sc.nextInt();
                sc.nextLine();
                result.remove(index);
            }
        }
         for (int num : result) {
             System.out.println(num +" ");
         }

        sc.close();

    }
}
