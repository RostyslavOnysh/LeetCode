Implement a function, multiples(m, n), which returns an array of the first m multiples of the real number n. Assume that m is a positive integer.

Ex.

multiples(3, 5.0)
should return

[5.0, 10.0, 15.0]


# Logic:
The goal of this code is to generate an array of the first m multiples of the number n. Each multiple is obtained by multiplying n by the index position (plus one) of that multiple in the array.

# Step-by-Step Logic:

* Create an array result of length m to store the multiples.
* Iterate from 0 to m - 1 (inclusive) using a for loop.
* For each iteration, calculate the i-th multiple by multiplying n with (i + 1), where i is the index of the current iteration.
* Store the calculated multiple in the corresponding index of the result array.
* After the loop completes, the result array contains the desired multiples.

```java
public class Kata {
public static int[] multiples(int m, int n) {
int[] result = new int[m]; // Step 1

        for (int i = 0; i < m; i++) { // Step 2
            result[i] = n * (i + 1); // Steps 3 and 4
        }

        return result; // Step 5
    }

    public static void main(String[] args) {
        int m = 3; // Number of multiples to generate
        int n = 5; // Base number to multiply
        int[] result = multiples(m, n); // Generate multiples
        for (int value : result) {
            System.out.println(value); // Print each multiple
        }
    }
}
```
In this code, the multiples method calculates the desired multiples of n and stores them in the result array. The main method demonstrates how to call the multiples method and print the generated multiples.

When you run the program with m = 3 and n = 5, it will output:

 
These are the first three multiples of 5: 5, 10, and 15.