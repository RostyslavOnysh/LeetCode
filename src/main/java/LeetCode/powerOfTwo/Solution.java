package LeetCode.powerOfTwo;

public class Solution {
    private static final byte ZERO = 0;
    private static final byte ONE = 1;
    private static final byte TWO = 2;

    public boolean isPowerOfTwo(int n) {
        if (n <= ZERO) {
            return false;
        }
        while (n > ONE) {
            if (n % TWO != ZERO) {
                return false;
            }
            n /= TWO;
        }
        return true;
    }
}

// OR
/*
     if (n < 0 || n == 0) {
        return false;
    }
    return (n & (n - 1)) == 0;
  }
 */
