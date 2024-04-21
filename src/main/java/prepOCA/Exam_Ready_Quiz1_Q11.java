package prepOCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam_Ready_Quiz1_Q11 {


    /*  int[] random = {6, -4, 12, 0, -10};
    int x = 12;
    int y = Arrays.binarySearch(random, x);
    System.out.println(y);


    Boolean b1 = true;
    Boolean b2 = false;
    int i = 0;
    while ("foo".equals("bar")) {
    }


    String names[] = new String[3];
    names[0] = "Mary Brown";
    names[1] = "Nancy Red";
    names[2] = "Jessy Orange";
    try {
        for(String n: names){
            try {
                String pwd = n.substring(0, 3)+n.substring(6, 10);
                System.out.println(pwd);
            }
            catch(StringIndexOutOfBoundsException sie){
                System.out.println("string out of limits");
            }
        }
    }
    catch(ArrayIndexOutOfBoundsException aie){
        System.out.println("array out of limits");
    }

     */
    /*    String color = "Red";
        switch (color) {
            case "Red":
                System.out.println("Found Red");
            case "Blue":
                System.out.println("Found Blue");
            case "White":
                System.out.println("Found White");
                break;
            default:
                System.out.println("Found Default");
        }


        int var1 = 5;
        int var2 = var1--;
        int var3 = 0;
        if (var2 < 0) {
            var3 = var2++;
        } else {
            var3 = --var2;
        }
        System.out.println(var3);
    }

     */
    public String add(String s1, String s2) {
        return s1 + s2;
    }

    StringBuilder sb = new StringBuilder(128);

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(16);
        ages.add(null);
        for (int i = 0; i < ages.size(); i++) System.out.print(ages.get(i));
        for (int i : ages) System.out.println(i);
    }


}
