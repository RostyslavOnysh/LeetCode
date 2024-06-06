# Task
Given two binary strings a and b, return their sum as a binary string.



Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"


Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.


# Solution 
```
  class Solution {
    public String addBinary(String a, String b) {
    int maxLength = Math.max(a.length(), b.length()) + 1;
        char[] sum = new char[maxLength];
        int carry = 0;
        int index = maxLength - 1;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int aDigit = i >= 0 ? a.charAt(i) - '0' : 0;
            int bDigit = j >= 0 ? b.charAt(j) - '0' : 0;
            int digitSum = aDigit + bDigit + carry;
            carry = digitSum / 2;
            sum[index--] = (char) ('0' + (digitSum % 2));
        }
        if (carry > 0) {
            sum[index--] = '1';
        }
        return new String(sum, index + 1, maxLength - index - 1);
    }
}
```

# Explanation:

1. The code defines a class named Solution with a single method addBinary, which takes two binary strings (a and b) as inputs and returns their sum as a binary string.
2. The maxLength variable calculates the maximum length needed for the result array, which is the longer of the two input strings plus one (in case there's a carry at the most significant bit).
3. A character array sum is initialized to store the digits of the sum.
4. The loop iterates through both input strings from right to left. It adds corresponding digits from a and b, along with the carry from the previous iteration, and calculates the current binary digit and the carry for the next iteration.
5. The calculated binary digit is stored in the sum array, and the index is decremented.
6. After the loop, if there's a carry remaining, it's added to the sum array.
7. Finally, a new string is created from the sum array, starting from the calculated index and with a length equal to the number of relevant digits. This string represents the final binary sum, which is then returned.

# Algorithm Complexity:

* ***Time Complexity***: The algorithm performs a single pass through both input strings, which takes O(max(N, M)) time, where N and M are the lengths of the input strings a and b, respectively.
* ***Space Complexity***: The algorithm uses extra space to store the sum array and a few integer variables. The space complexity is O(max(N, M)).

