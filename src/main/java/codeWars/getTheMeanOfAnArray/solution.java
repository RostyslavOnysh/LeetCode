package codeWars.getTheMeanOfAnArray;

import java.util.Arrays;

public class solution {
    public static int getAverage(int[] marks) {
      return (int) Arrays.stream(marks)
              .average()
              .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(getAverage(new int [] {1,2,3,4,5}));
    }
}