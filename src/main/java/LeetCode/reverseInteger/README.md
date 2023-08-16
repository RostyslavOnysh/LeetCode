# Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:
```bash
Input: x = 123
Output: 321
```
```bash
Input: x = -123
Output: -321
```

```bash
Input: x = 120
Output: 21
```

* Constraints:

-2^31 <= x <= 2^31 - 1

# Intuition 📝 📖
When reversing an integer, we want to construct a new integer where the digits of the original number are reversed. To achieve this, we can extract the last digit of the number using the modulo operation (%) and append it to a new number. We need to be cautious about the possibility of integer overflow when constructing the new reversed number.

# Approach 📕
Our approach involves iterating through the digits of the input integer. We use a loop to repeatedly extract the last digit of the input number and construct the reversed number. During this process, we check for potential integer overflow by ensuring that the reversed number, after appending the new digit, is equal to what we expect.


## Step-by-step Process ✏️🔬
1. We initialize a variable `reversed` to store the reversed integer.
2. We use a `for` loop with the condition `x != 0` to iterate through the digits of the input integer `x`. This loop iterates as long as there are digits remaining in `x`.
3. In each iteration, we extract the last digit of `x` using the modulo operation `x % 10` and store it in the variable `digit`.
4. We perform a check to ensure that appending the digit to `reversed` does not cause integer overflow. This is done by checking whether `(reversed * 10 + digit - digit) / 10` equals the original `reversed`. If it doesn't, we know that an overflow has occurred, and we immediately return 0.
5. If no overflow is detected, we update the `reversed` integer by shifting its digits left by multiplying it by 10 and then adding the extracted `digit`.
6. We continue this process until all digits of `x` are processed, and `x` becomes 0.



# Complexity 🚀 ✈️
- Time complexity: `O(log(x))`, where x is the input integer. In each iteration, we divide x by 10, effectively removing one digit.
- Space complexity: `O(1)`, as we only use a constant amount of extra space.

# Algorithm 🔸

The algorithm used in this solution is based on the idea of reversing the digits of the input integer by constructing a new integer digit by digit. We iterate through the digits of the input integer, extracting the last digit in each iteration and appending it to the reversed number. The key aspect of this solution is the check for integer overflow during construction.

# Why This Algorithm? 🔸🔸

This algorithm was chosen because it efficiently reverses the digits of the input integer while maintaining the constraints of the problem. It has a logarithmic time complexity, making it suitable for reversing integers within the specified constraints. The check for integer overflow ensures that the solution handles edge cases where the reversed integer might go beyond the 32-bit signed integer range.

By using this approach, we achieve an efficient and reliable solution to the problem of reversing an integer while considering potential overflow issues.

# Code
```java
class Solution {
    public int reverse(int x) {
          int reversed = 0;
        for (; x != 0; x /= 10) {
            int digit = x % 10;
            if ((reversed * 10 + digit - digit) / 10 != reversed) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
```
