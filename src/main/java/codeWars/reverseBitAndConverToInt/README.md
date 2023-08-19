Write a function that reverses the bits in an integer.

For example, the number 417 is 110100001 in binary. Reversing the binary is 100001011 which is 267.

You can assume that the number is not negative.


* (reversed << 1): This is a left shift operation by 1 position. In each iteration, this operation shifts all the bits of the reversed number one position to the left, creating space for the new least significant bit.
* (n & 1): This is a bitwise "AND" between the least significant bit of the number n and 1. Since n & 1 equals 1 if the least significant bit of n is also 1, and it equals 0 if the least significant bit of n is 0, this operation produces the least significant bit of the number n.
* |: This is a bitwise "OR" operation. The operation (reversed << 1) | (n & 1) combines the results of shifting reversed to the left by one position with the least significant bit of n, thus creating a new set of bits that represents the "reversed" version of n with the added bits.
* n >>= 1: This is a right shift operation of the number n by 1 position. After obtaining the least significant bit of n, this operation shifts all the other bits of n to the right, preparing them for processing in the next iteration.

```java
public static int reverseBits(int n) {
return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
}
```
* Integer.toBinaryString(n): This part of the code converts the integer n into its binary string representation. For example, if n is 417, it will be converted to the string "110100001".
* new StringBuilder(...).reverse(): Here, we create a new StringBuilder object that takes the binary string representation from the previous step as input. Then, we call the .reverse() method on it, which reverses the string. In our case, "110100001" becomes "100001011".
* .toString(): After the string has been reversed using the .reverse() method, we use .toString() to retrieve the modified string.
* Integer.parseInt(..., 2): Now, we take the reversed binary string (e.g., "100001011") and convert it back to an integer. The second argument 2 indicates that we want to perform the conversion from binary numeral system.
* Regarding the use of StringBuilder:
* Using StringBuilder to convert the binary string and reverse it is convenient, but it might be slightly less efficient in terms of performance. Creating a StringBuilder object involves additional operations compared to directly using bitwise operations to reverse the bits.

If performance is a critical factor, then using bitwise operations (like in the previous example) might be a more efficient option. However, if code readability is a higher priority, the StringBuilder approach might be more convenient.