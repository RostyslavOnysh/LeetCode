# [Task](https://leetcode.com/problems/palindrome-number/solutions/3862995/jv-palindrome/)

Given an integer x, return true if x is a
palindrome
, and false otherwise.



***Example 1:***
```java
Input: x = 121
Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
```
***Example 2:***
```java
Input: x = -121
Output: false
///Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```
***Example 3:***
```java
Input: x = 10
Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```


* Constraints:
-231 <= x <= 231 - 1

### Follow up: Could you solve it without converting the integer to a string?

# Intuition 📖
When approaching this problem, we first recognize that a palindrome number remains the same when its digits are reversed. Our goal is to determine whether a given integer is a palindrome. However, to optimize the process, we can focus on reversing only half of the digits and comparing them to the other half.

# Approach
1. we start by handling edge cases where the number is negative or ends with a zero (except zero itself). Negative numbers and numbers ending with zero cannot be palindromes, so we return false for these cases.
2. We initialize a variable reversedNumber to store the reversed digits.
3. Using a while loop, we reverse the digits of the number. In each iteration, we add the last digit of the original number to the reversedNumber after shifting it one place to the left. We also remove the last digit from the original number.
4. We continue this process until the remaining part of the number is greater than the reversed part.
5. After the loop, we compare the original number (or its half, in case of odd number of digits) with the reversed number. If they match, the number is a palindrome and we return true; otherwise, we return false.

# Complexity ❗

1. The time complexity of this solution is determined by the number of digits in the input number, which is roughly $$O(\log_{10}(n))$$, where n
is the input number.
* This is because the while loop iterates until the remaining part of the number is greater than the reversed part. In each iteration, the number is divided by 10, effectively reducing the number of digits by one. Since the number of iterations required to reduce the number to 0 is proportional to the number of digits in the original number, the time complexity is logarithmic with respect to the input number's magnitude.

# Time Complexity Analysis: 💥 
* The primary factor influencing the time complexity is the number of digits in the input integer x.
* In each iteration of the loop, the last digit of x is extracted using modulo operation (x % 10), and the loop continues until x is fully reversed. Since the number of iterations is proportional to the number of digits in x, this process exhibits logarithmic behavior.
* Assuming the loop runs until x becomes 0, the number of iterations corresponds to the number of digits in x, which is logarithmic in base 10. Consequently, the time complexity is denoted as O(log n), where n represents the value of the input integer x.

- Space complexity: 🐵
Space complexity: The space complexity is 
$$O(1)$$ as we only use a constant amount of extra space for variables.

# Code
```java
class Solution {
    public boolean isPalindrome(int x) {
     if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == reversedNumber || x == reversedNumber / 10;
    }
}
```
