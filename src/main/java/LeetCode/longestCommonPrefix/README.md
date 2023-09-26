Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


# Solvind 
1. The function starts by checking if the input array strs is null or empty. If it is, the function returns an empty string, as there is no common prefix to find.
2. The variable prefix is initialized with the first string in the array strs. This serves as the initial candidate for the common prefix.
3. for loop is used to iterate through each string in the strs array.
4. Inside the loop, currentWord is assigned the value of the current string being processed. The variable j is initialized to 0 and will be used to iterate through the characters of prefix and currentWord to find the common prefix.
5. Within the loop, a while loop is used to compare characters at the same position in both prefix and currentWord. The loop continues as long as three conditions are met:
  *  j is less than the length of prefix
  *  j is less than the length of currentWord
  *  The characters at position j in prefix and currentWord are equal.
   This loop essentially finds the length of the common prefix shared by prefix and currentWord.
6. fter the loop, prefix is updated to be a substring of itself, containing only the characters up to position j.
This ensures that prefix now holds the common prefix found so far among all the processed strings.
7. There's a check to see if prefix has become an empty string. If it has, there is no common prefix among the strings, so the loop is terminated early using break.
8. Finally, the function returns the prefix, which contains the longest common prefix among all the strings in the input array.

# Algorithm Complexity:

Time Complexity: O(N*M), where N is the number of strings in the array and M is the length of the longest string. In the worst case, the algorithm compares each character of each string with the corresponding character in the prefix.
Space Complexity: O(1), because the code doesn't use any extra data structures that depend on the input size. It uses a constant amount of memory to store prefix, currentWord, and j.