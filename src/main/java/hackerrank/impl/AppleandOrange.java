package hackerrank.impl;

import java.util.List;

public class AppleandOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
       int appleOnHouse = 0;
       int orangeOnHouse = 0;

       for (int apple : apples) {
           int landingPosition = a + apple;
           if (landingPosition >= s && landingPosition <= t) {
               appleOnHouse++;
           }
       }

        for (int orange : oranges) {
            int landingPosition = b + orange;
            if (landingPosition >= s && landingPosition <= t) {
                orangeOnHouse++;
            }
            System.out.println(appleOnHouse);
            System.out.println(orangeOnHouse);
        }

    }

}
