# Manacher's Algorithm: Linear-Time Longest Palindromic Substring 🚀

Manacher's algorithm, developed by G. Manacher in 1975, is a groundbreaking approach for efficiently discovering the longest palindromic substring within a given string.

# Algorithm Overview:
The algorithm leverages the Manacher Table, a dynamic data structure, to achieve its remarkable efficiency. This table stores the lengths of palindromic subsequences that initiate at different positions in the input string.

# How It Works:

Initialize the Manacher Table with zeros.
Iterate through the string, and at each position, examine the Manacher Table to identify existing palindromic substrings.
If a palindromic substring is found, update the Manacher Table with its length.
Continue iterating until the end of the string is reached, revealing the longest palindromic substring.
# Key Insights for Beginners:

A palindrome is a sequence that reads the same forwards and backwards.
The longest palindromic substring is the lengthiest substring that is a palindrome.
The Manacher Table stores lengths of palindromic subsequences starting at different positions.
Java Code Sample:
Here's a Java implementation of Manacher's Algorithm:

```java
public class Manacher {
    public String longestPalindrome(String s) {
    int start = 0, end = 0;
        for(int i = 0; i < s.length(); i ++) {
        char c = s.charAt(i);
        int left = i;
        int right = i;
        while(left >= 0 && s.charAt(left) == c)
            left --;
        while(right < s.length() && s.charAt(right) == c) right ++;
        while(left >= 0 && right < s.length()) {
            if(s.charAt(left) != s.charAt(right)) break;
            left --;
            right ++;
        }
        left += 1;
        start = (end - start < right - left) ? left : start;
        end = (end - start < right - left) ? right : end;
    }
        return s.substring(start, end);
}
```
# Use Cases:
Manacher's algorithm finds applications in various scenarios:

Identifying the longest palindromic substring in a string.
Generating palindromes.
Verifying if a word is a palindrome.
In conclusion, Manacher's Algorithm is a game-changer for detecting the longest palindromic substring in a string with linear time complexity, irrespective of the string's length. Its efficient approach, centered around the Manacher Table, renders it an indispensable tool for tackling complex problems in string processing and algorithmic exploration.

