package codeWars.reverseBitAndConverToInt;

public class Solution {
    public static int reverse_bits(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = (reversed << 1) | (n & 1);
            n >>= 1;
        }
        return reversed;
    }
}

/*
  return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
 */
