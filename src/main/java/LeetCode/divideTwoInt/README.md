# Task
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

### Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.



# Example 1:
 
Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
# Example 2:
 
Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.


# Constraints:

-231 <= dividend, divisor <= 231 - 1
divisor != 0
Accepted
630.9K



# Intuition 📝
Dividing two integers without using traditional division, multiplication, or mod operators might sound like a challenging task, but fear not! We can delve into a custom division algorithm that employs an ingenious technique called the "Power of Two" to streamline the process.

Imagine a world where we could subtract the divisor from the dividend repeatedly, just like a magician performing the same trick over and over. But wait, there's more! With the "Power of Two" technique, we don't need to repeat the trick endlessly. Instead, we can magically double the divisor's value and our count of divisions with each iteration!

# Approach  🔧
Before we dive into the mesmerizing algorithm, let's handle some special cases first. If the divisor is 1, then the result is simply the dividend, and if the divisor is -1, we must be cautious of potential integer overflow. But fret not, we've got it all covered!

Now, let's unleash the magic! We'll determine the sign of the result based on the signs of the dividend and divisor using the mystical XOR (^) operator. To ensure that we don't lose ourselves in the realm of integer overflow, we'll convert both numbers to positive values by casting them to long data types.

Now, here comes the enchanting part. We'll perform the division using repeated subtraction and the "Power of Two" technique:
* We use a while loop that continues as long as the dividend (dividendL) is greater than or equal to the divisor (divisorL).
```java 
 while (dividendL >= divisorL) {
            long powerOfTwo = 1;
            long tmpDivisor = divisorL;
            while (dividendL >= (tmpDivisor << 1)) {
                tmpDivisor <<= 1;
                powerOfTwo <<= 1;
            }
```
* Inside the loop, we initialize two variables: powerOfTwo and tmpDivisor. powerOfTwo keeps track of the count of divisions, and tmpDivisor is a temporary variable used for repeated subtraction.
* We enter a nested while loop that checks if we can double the tmpDivisor without causing an overflow (i.e., the result of (tmpDivisor << 1) is less than or equal to dividendL). If this condition is true, we double both tmpDivisor and powerOfTwo. This is the "Power of Two" technique, where we multiply the divisor and the count of divisions by 2 at each iteration.
* This optimization speeds up the division process by reducing the number of subtractions needed.
* After finding the maximum number of divisions that can be performed without causing an overflow, we subtract the value of tmpDivisor from the dividendL to perform the actual division.
* We update the quotient variable by adding the powerOfTwo, which represents the number of divisions performed during this iteration.
* Return the result: Finally, we return the quotient with the correct sign based on the step 2.

# Complexity 📏 📐
- Time complexity:👻
  The time complexity of the division algorithm is approximately ***O(log(N))***, where N is the absolute value of the dividend. The "Power of Two" technique effectively divides the dividend by 2 at each iteration, reducing the number of subtractions needed.


- Space complexity:🎃
  The space complexity is ***O(1)*** as we use a constant amount of extra space for variables, regardless of the input size.


# Why This Algorithm?♨️
The chosen algorithm uses repeated subtraction and the "Power of Two" technique to divide the two integers without using multiplication, division, and mod operators. This approach is efficient as it reduces the number of subtractions needed to find the quotient. The repeated subtraction narrows down the possible quotient values, while the "Power of Two" technique speeds up the process by doubling the divisor and count of divisions at each iteration. The algorithm handles special cases and integer overflow issues, ensuring that the result stays within the 32-bit signed integer range. Moreover, the implementation is concise and easy to understand, making it a suitable choice for solving the problem.

# Code 🚀
```
class Solution {
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
}
```


![d3410b4e6b1fb6176b724575c5469909.jpg](https://assets.leetcode.com/users/images/97a56d35-a24e-401c-b09a-fe7b6e49b430_1691351631.5044928.jpeg)
