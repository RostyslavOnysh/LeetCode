package hackerrank.impl;

import java.util.List;

public class AppleandOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleHouse = 0;
        int orangeHouse = 0;

        for (int apple : apples) {
            int landingPos = a + apple;
            if (landingPos >= s && landingPos <= t) {
                appleHouse++;
            }
        }

        for (int orange : oranges) {
            int landingPos = b + orange;
            if (landingPos >= s && landingPos <= t) {
                orangeHouse++;
            }
        }
        System.out.println(appleHouse);
        System.out.println(orangeHouse);
    }
}
