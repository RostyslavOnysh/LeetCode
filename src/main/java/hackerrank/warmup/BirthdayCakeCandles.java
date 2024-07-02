package hackerrank.warmup;

import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;

       for (int height : candles) {
           if (height > max) {
               max = height;
           }
        }

       for (int repeat : candles) {
           if (repeat == max) {
               count++;
           }
       }
        return count;
    }
}
