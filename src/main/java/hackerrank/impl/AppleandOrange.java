package hackerrank.impl;

import java.util.List;

public class AppleandOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applesOnHouse = 0;
        int orangesOnHouse = 0;

        // Count the apples that fall on the house
        for (int apple : apples) {
            int landingPosition = a + apple;
            if (landingPosition >= s && landingPosition <= t) {
                applesOnHouse++;
            }
        }

        // Count the oranges that fall on the house
        for (int orange : oranges) {
            int landingPosition = b + orange;
            if (landingPosition >= s && landingPosition <= t) {
                orangesOnHouse++;
            }
        }

        // Print the results
        System.out.println(applesOnHouse);
        System.out.println(orangesOnHouse);
    }

}
