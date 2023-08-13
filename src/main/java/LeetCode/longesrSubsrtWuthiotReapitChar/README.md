# Task
Given a ***string s***, find the length of the longest
substring
*without* repeating characters.

# Example 1:
```bash
Input: s = "abcabcbb"
Output: 3
```
Explanation: The answer is "abc", with the length of 3.
# Example 2:
```bash
Input: s = "bbbbb"
Output: 1
```
Explanation: The answer is "b", with the length of 1.
# Example 3:
```bash
Input: s = "pwwkew"
Output: 3
```
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


# Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

# Code Explanation:
```java
 
class Solution {
public int lengthOfLongestSubstring(String s) {
Set<Character> charSet = new HashSet<>();
int longestSubstring = 0;
int windowStart = 0, windowEnd = 0;

        while (windowEnd < s.length()) {
            if (!charSet.contains(s.charAt(windowEnd))) {
                charSet.add(s.charAt(windowEnd));
                longestSubstring = Math.max(longestSubstring, windowEnd - windowStart + 1);
                windowEnd++;
            } else {
                charSet.remove(s.charAt(windowStart));
                windowStart++;
            }
        }
        
        return longestSubstring;
    }
}
```
# Step by Step Explanation:

* The code defines a class Solution and a method lengthOfLongestSubstring that takes a string s as input and returns the length of the longest substring without repeating characters.
* charSet is a Set that will store the characters within the current sliding window. It helps to keep track of characters for quick lookups and to determine if a character has already appeared within the current window.
* longestSubstring will hold the length of the longest substring without repeating characters encountered so far.
* windowStart and windowEnd are pointers that define the current window of characters being examined. Initially, both point to the start of the string.
* The while loop iterates through the string, moving the windowEnd pointer.
* Inside the loop, there's a conditional check: if the current character (s.charAt(windowEnd)) is not in the charSet, it's a unique character within the current window.
* If the character is unique, it's added to charSet, and the length of the current substring is updated using Math.max(longestSubstring, windowEnd - windowStart + 1). This calculates the length of the current window and compares it to the longest substring found so far, updating longestSubstring if needed.
* The windowEnd pointer is then moved one step to the right.
* If the current character is already in charSet, it indicates a repeating character. The character at windowStart is removed from the set, and the windowStart pointer is moved one step to the right. This effectively contracts the window.
* The loop continues until windowEnd reaches the end of the string.
* The function returns longestSubstring, which holds the length of the longest substring without repeating characters.


1. Initialize variables:
2. charSet: An empty set to track characters in the current window.
3. longestSubstring: Initialized to 0 to keep track of the longest substring without repeating characters.
4. windowStart and windowEnd: Both initially set to 0, marking the start and end of the current window.
5. ***First Iteration:***
6. windowEnd is at index 0 ('a'). Since the set is empty, add 'a' to charSet.
7. Update longestSubstring to 1 (length of the current window).
8. Increment windowEnd to 1.
9. ***Second Iteration:*** 
10. windowEnd is at index 1 ('b'). 'b' is not in the set, so add it to charSet.
11. Update longestSubstring to 2 (length of the current window).
12. Increment windowEnd to 2.
13. ***Third Iteration:***
14. windowEnd is at index 2 ('c'). 'c' is not in the set, so add it to charSet.
15. Update longestSubstring to 3 (length of the current window).
16. Increment windowEnd to 3.
17. ***Fourth Iteration:***
18. windowEnd is at index 3 ('a'). 'a' is already in the set, so remove 'a' from the start of the window and increment windowStart to 1.
19. ***Fifth Iteration:***
20. windowEnd is at index 4 ('b'). 'b' is already in the set, so remove 'b' from the start of the window and increment windowStart to 2.
21. ***Sixth Iteration:***
22. windowEnd is at index 5 ('c'). 'c' is already in the set, so remove 'c' from the start of the window and increment windowStart to 3.
23. ***Seventh Iteration:***
24. windowEnd is at index 6 ('b'). 'b' is already in the set, so remove 'b' from the start of the window and increment windowStart to 4.
25. At this point, the while loop ends because windowEnd is equal to the length of the input string.
26. The function returns the value of longestSubstring, which is 3 (length of the longest substring without repeating characters).
* So, for the input "abcabcbb", the code correctly calculates the length of the longest substring without repeating characters as 3.


# Time Complexity:
The time complexity of this algorithm is O(n), where n is the length of the input string s. The algorithm iterates through the string once, and each character is processed only once.

# Algorithm Comparison:
* ***Sliding Window Algorithm:*** This approach maintains a sliding window of characters that ensures no repeating characters within it. It utilizes the Set data structure for efficient character tracking. The algorithm's time complexity is linear, making it more efficient for larger inputs.
* Brute-Force Algorithm: The brute-force approach involves checking all possible substrings for repeating characters and finding the longest substring without any repetitions. This approach has a time complexity of O(n^3) due to the nested loops required for substring generation and checking.
In summary, the sliding window algorithm is significantly more efficient than the brute-force approach, making it a better choice for solving this problem. It operates in linear time and uses a Set to efficiently track characters, leading to better performance on larger inputs
