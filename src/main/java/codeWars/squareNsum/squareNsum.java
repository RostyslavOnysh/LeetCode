package codeWars.squareNsum;

import java.util.Arrays;

public class squareNsum {
    public static int squareSum(int[] n) {
        /*   int result = 0;
        for (int num : n) {
            result += num * num;
        }
        return result;


         */
        return Arrays.stream(n).map(x -> x * x).sum();
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{4}));
    }
}