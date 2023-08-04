# Task 📑

Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

***Note**** that the same word in the dictionary may be reused multiple times in the segmentation.



# Example 1: 
```java
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
//Explanation: Return true because "leetcode" can be segmented as "leet code"
```
# Example 2:
```java
Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
//Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
```
Note that you are allowed to reuse a dictionary word.
# Example 3:
```java
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
```


# Constraints:

* 1 <= s.length <= 300
* 1 <= wordDict.length <= 1000
* 1 <= wordDict[i].length <= 20
* s and wordDict[i] consist of only lowercase English letters.
***All the strings of wordDict are unique.***


# Intuition 📖
Imagine you're trying to solve a puzzle where you have a string made up of different pieces, and you wonder if these pieces could be reassembled from words in your dictionary. It's like fitting words together to create the original string. This puzzle is what we're trying to solve here – whether we can break down the input string into a sequence of words from the dictionary. And guess what? We're going to use dynamic programming to unlock the solution, piece by piece!

# Approach 🔬
* Let's start by figuring out the longest word in the dictionary. Just like finding the biggest piece of a jigsaw puzzle.
* Now, we're going to create a magic trick – a boolean array called dp. Each element of this array will tell us whether a particular chunk of the string can be turned into words from the dictionary. We'll light up the magic lantern by setting dp[0] to true, because an empty string can always be built.
* Into our magical toolbox goes a set called wordSet. This set contains all the words from the dictionary, and we'll use it to summon words whenever we need them. Think of it as the magician's assistant with the right word cards!
* Now comes the magic show: we'll take each position i in the string from 1 to n. For each i, we'll look back to previous positions from i - 1 to 0, creating chunks of different sizes. Just like when the magician pulls out a series of scarves from their sleeve, we're creating chunks to see if they can match words from our magical wordSet. If a previous chunk (say, at position j) can be transformed and the current chunk from j to i exists in the wordSet, it's like the magician's trick working perfectly – we set dp[i] to true.
* Finally, the climax! If dp[n] (where n is the length of our string) is true, it's like the magician unveiling the secret – we can break down the entire string into words. The audience goes wild!

# Complexity
- Time complexity:
  Our grand magic performance involves a nested loop. It's like juggling multiple balls in the air. This nested loop has a complexity of O(n * maxLen), where n is the length of the input string and maxLen is the length of the longest word in the dictionary. The complete time complexity is a mix of the string's length, the number of words in the dictionary, and the average word length – let's call it ***O(n * m * k)***.

- Space complexity:
  Behind the curtain, we have the dp array (O(n)) and the wordSet (O(m * k)). The entire space complexity of our magical theater is ***O(n + m * k)***.

# Performance Metrics : 🚀🚀

## Runtime: 1ms
This solution showcases lightning-fast execution, outperforming approximately 99.85% of other submissions. It's like completing the puzzle before the competition even starts!
## Memory Usage: 40.52MB
With a memory footprint that's more efficient than around 98.58% of other Java solutions, this algorithm demonstrates elegance in its resource management.
In the realm of algorithmic battles, this solution stands as a champion – its efficiency and elegance reigning supreme. It's as if the code has been woven with intricate spells, casting aside challenges and triumphing in both time and memory.

# Code
```
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        int maxLen = 0;
    for (String word : wordDict) {
        maxLen = Math.max(maxLen, word.length());
    }
        
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        Set<String> wordSet = new HashSet<>(wordDict);
        
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 0 && i - j <= maxLen; j--) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
```


![5cf41000cf00a746fd79c10a6f417f18.jpg](https://assets.leetcode.com/users/images/562e06fa-4d2e-4fcf-9d67-923e55ceffb8_1691173453.032688.jpeg)
