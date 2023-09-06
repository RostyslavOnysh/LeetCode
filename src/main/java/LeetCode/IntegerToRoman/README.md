Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.



Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= num <= 3999




# Explanation 
🔸 Intuition

The problem at hand is to convert an integer into its Roman numeral representation. My initial thought on how to solve this problem is to utilize an array of Roman numeral symbols and their corresponding values. We will iterate through this array, subtracting the largest possible value at each step until the number becomes zero, appending the corresponding Roman numeral symbol to the result string during each subtraction.

🔸 Approach

We define two arrays: romanSymbols to store the Roman numeral symbols and romanValues to store their corresponding values.
We initialize an empty StringBuilder called romanBuilder to build the Roman numeral representation.
We iterate through the romanValues array from largest to smallest values.
In each iteration, we check if the current num is greater than or equal to the current romanValues[i]. If it is, we append the corresponding romanSymbols[i] to romanBuilder and subtract romanValues[i] from num. We repeat this process until num becomes zero.
🔸 Complexity

Time complexity: 🚀
O(13), which is equivalent to O(1) because the size of the romanValues and romanSymbols arrays is fixed and small.

Space complexity: ✈️
The space complexity is O(n), where n is the number of characters in the Roman numeral representation. However, since the Roman numerals have a fixed maximum length for any integer input, the space complexity can be considered O(1).

🔸 Code
```
class Solution {
public String intToRoman(int num) {
String [] romanSymbols = { "M", "CM",  "D",  "CD",   "C",  "XC",  
"L",   "XL",   "X",  "IX",   "V",   "IV",     "I"};
int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanBuilder = new StringBuilder();

    for(int i = 0; i < romanValues.length; i++) {
        while (num >= romanValues[i]) {
            romanBuilder.append(romanSymbols[i]);
            num -= romanValues[i];
    }
}
return romanBuilder.toString();
}
}
```