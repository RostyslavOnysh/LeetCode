# Task 
Given a string s, return the longest
palindromic

substring
in s.



## Example 1:
```bash
Input: s = "babad"
Output: "bab"
```
Explanation: "aba" is also a valid answer.
## Example 2:
```bash
Input: s = "cbbd"
Output: "bb"
```

## Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

```java
class Solution {
public String longestPalindrome(String s) {
int start = 0, end = 0;
for(int i = 0; i < s.length(); i ++) {
char c = s.charAt(i);
int left = i;
int right = i;

           // Expanding around the current character to find the longest palindrome centered at it
           while(left >= 0 && s.charAt(left) == c) 
               left --;
           while(right < s.length() && s.charAt(right) == c) 
               right ++;
           while(left >= 0 && right < s.length()) {
               if(s.charAt(left) != s.charAt(right)) 
                   break;
               left --;
               right ++;
           }
           left += 1;
           
           // Update the start and end indices if a longer palindrome is found
           if (end - start < right - left) {
               start = left;
               end = right;
           }
       } 
       
       // Return the longest palindromic substring using the start and end indices
       return s.substring(start, end);
    }
}
```
# Step-by-Step Explanation:

* Initialization of start and end indices: Variables start and end indicate the indices of the beginning and end of the longest palindromic substring in the string. Initially, both point to 0, as we haven't found any palindrome yet.
* Loop over string s: We iterate through each character in the string ***s using index i.***
* Fetching the current character c: We retrieve the current character of the string s using the ***charAt(i)*** method.
* Expanding around the current character to find a palindrome: We use two indices, left and right, to expand the palindrome around the current character. We start expanding both left and right from the current character, comparing characters. This helps us find the longest palindrome centered at this character.
* Completion of expansion and determination of new left and right indices: After expansion, we have values for left and right that indicate the boundary indices of the palindrome found.
* Re-expanding around the palindrome to find a longer palindrome: We continue to expand the palindrome both left and right by comparing characters s.charAt(left) and s.charAt(right). This helps us find the longest possible palindrome for this character.
* Updating start and end for the longest palindrome: If the found palindrome is longer than the previous one, we update the values of start and end with the current left and right values.
* Iteration for the next character: After processing the current character, we move to the next iteration of the loop.
* Returning the result: After completing the loop, we return the longest palindromic substring using the start and end indices.
* This solution utilizes the property of palindromes and efficiently expands around each character to find the longest palindromic substring. The approach of updating the start and end indices whenever a longer palindrome is found ensures that we keep track of the maximum palindrome. The algorithm runs with linear time complexity and effectively solves the task of finding the longest palindromic substring in the given string.






# Explanation(UA)
Ця задача має на меті знайти найдовший паліндромний підрядок у заданому рядку s. 
Паліндром - це рядок, який читається однаково в обидва боки. Ваша мета - знайти такий підрядок, який є паліндромом і має максимальну довжину.

Отже, ваше рішення базується на циклі, який проходить через кожен символ c у рядку s. Для кожного символу ви розглядаєте можливі паліндроми, які можуть починатися в цьому символі. Для цього ви використовуєте два вказівника: ***left та right,*** які спрямовані вліво та вправо від поточного символу.

Спочатку ви встановлюєте ***left і right*** на поточний символ. Потім ви за допомогою циклів ***while*** зміщуєте ***left вліво***, перевіряючи, чи символи на позиціях ***left та right є однаковими***, і чи довільні паліндромні властивості виконуються для цього фрагменту.
Після того, як ви визначили, скільки символів можна розширити вліво і вправо від поточного символу, ви використовуєте їх для визначення довжини потенційного паліндрому.
Якщо довжина цього потенційного паліндрому більша за попередній найдовший паліндром, то ви оновлюєте start та end, щоб зберегти інформацію про новий найдовший паліндромний підрядок.
В кінці циклу, ви повертаєте підрядок рядка s від індексу start до end, який і буде найдовшим паліндромним підрядком.
Основна ідея в тому, що ви розглядаєте кожну можливу точку як потенційний центр паліндрому, і спробуєте розширити паліндром навколо неї, враховуючи обмеження ліворуч та праворуч. Це дозволяє знайти максимально можливий паліндромний підрядок в заданому рядку.