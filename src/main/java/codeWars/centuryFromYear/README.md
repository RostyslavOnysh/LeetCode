# Version 1:

```java
 
package codeWars;

public class CenturyFromYear {
    public static int century(int number) {
        int century = (int) Math.ceil(number / 100.0);
        return century;
    }
}
``` 
# Version 2:

```java
 
package codeWars;

public class CenturyFromYear {
    public static int century(int number) {
        return (number - 1) / 100 + 1;
    }
}
```
## Explanation:

Both versions of the code are designed to determine the century based on a given year. Let's go through each version and discuss their workings:

# Version 1:

In this version, the century method takes an integer number as an argument representing a year. The goal is to calculate the century that the year falls into. The formula (int) Math.ceil(number / 100.0) is used to achieve this.

number / 100.0: This division calculates the raw century value (e.g., 2021 / 100.0 = 20.21).
Math.ceil(...): This function rounds up the result of the division to the nearest higher integer (e.g., Math.ceil(20.21) = 21.0).
(int) ...: This casts the rounded up value to an integer (e.g., (int) 21.0 = 21).
The result is the century in which the given year falls, and it is returned as the output of the method.

# Version 2:

In this version, the same century method is used, but the calculation is done differently:

(number - 1) / 100 + 1: This formula calculates the century by subtracting 1 from the year, then dividing by 100, and finally adding 1 to the result.
Which Version is Better?

Both versions are valid and accomplish the same goal. However, the second version is often preferred due to its simplicity and avoidance of floating-point arithmetic. It doesn't require casting or floating-point division, which can sometimes lead to precision issues in certain programming languages.

# Time Complexity:

Both versions of the code have a time complexity of O(1), as the calculations involved are constant and don't depend on the size of the input.

# Space Complexity:

The space complexity for both versions is also O(1), as they use a constant amount of memory for storing variables and performing calculations.

In terms of efficiency, the second version is slightly more efficient due to its simplicity and avoidance of floating-point operations.
