package LeetCode.divideTwoInt;

public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return -dividend;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        int quotient = 0;
        while (dividendL >= divisorL) {
            long powerOfTwo = 1;
            long tmpDivisor = divisorL;
            while (dividendL >= (tmpDivisor << 1)) {
                tmpDivisor <<= 1;
                powerOfTwo <<= 1;
            }
            dividendL -= tmpDivisor;
            quotient += powerOfTwo;
        }
        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        DivideTwoIntegers divisor = new DivideTwoIntegers();
        System.out.println(divisor.divide(10, 3)); // Output: 3
        System.out.println(divisor.divide(7, -3)); // Output: -2
    }
}
