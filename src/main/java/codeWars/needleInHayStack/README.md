Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle, so:

Example(Input --> Output)

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
Note: In COBOL, it should return "found the needle at position 6"
```java
public class NeedleFinder {
public static String findNeedle(Object[] haystack) {
OptionalInt value = IntStream
.range(0, haystack.length)   // Step 1
.filter(i -> "needle".equals(haystack[i])) // Step 2
.findFirst();   // Step 3

        return value.isPresent() ? "found the needle at position " + value.getAsInt() : "needle not found";
    }

    public static void main(String[] args) {
        Object[] array = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        String result = findNeedle(array);
        System.out.println(result);
    }
}
```
* IntStream.range(0, haystack.length): This creates an IntStream of indices ranging from 0 (inclusive) to the length of the haystack array (exclusive). Essentially, it generates a stream of numbers corresponding to the indices of the array.
* .filter(i -> "needle".equals(haystack[i])): This is a stream operation that filters the stream of indices. It checks if the element at the current index (i) in the haystack array is equal to the string "needle". If it is, the index is included in the filtered stream; otherwise, it's excluded.
* .findFirst(): This terminal operation is used to find the first element in the filtered stream. In this case, it returns an OptionalInt containing the index of the first occurrence of "needle" in the array, or an empty OptionalInt if "needle" is not found.
* OptionalInt value = ...: The result of the previous stream operations is assigned to the value variable, which is of type OptionalInt.
* return value.isPresent() ? "found the needle at position " + value.getAsInt() : "needle not found";: This ternary expression checks if the value contains a non-empty value (an index where "needle" was found). If it does, it constructs and returns a message indicating the position where "needle" was found. If the value is empty (no occurrence of "needle"), it returns a message indicating that "needle" was not found.
* In the main method, an example array array is defined, and the findNeedle function is called with this array. The result is then printed to the console.
- The code leverages Java's Stream API to create a more concise and functional approach to finding the index of "needle" in the array and constructing the appropriate message.

# IntStream.range(0, haystack.length)
construct is similar to a for loop in terms of generating a sequence of integers that can be used to iterate over indices, just like you would in a for loop. It's a compact and functional way of generating a sequence of numbers.

In a traditional for loop, you might write something like:

```java
for (int i = 0; i < haystack.length; i++) {
// ...
}
```
* With the IntStream.range(0, haystack.length) construct, you're using the Stream API to generate a range of integers from 0 (inclusive) to haystack.length (exclusive), which essentially represents the indices of the haystack array. This stream can be processed using various stream operations, such as filter, map, and forEach, to perform operations on the indices or their corresponding elements.

So, while not exactly the same as a traditional for loop, IntStream.range provides a concise and functional way to generate a sequence of numbers, especially when you're working with arrays or collections.


Whether to use IntStream.range or a traditional for loop depends on the context and the goals of your code. Here are some considerations to help you decide:

# Advantages of IntStream.range:

- ***Conciseness***: IntStream.range provides a more concise and functional way to generate a sequence of numbers. It can make your code cleaner and easier to read, especially when combined with other stream operations.
Readability: Stream operations tend to be more expressive and can make your code more self-documenting. Each operation in the stream pipeline can represent a specific transformation or filtering step.
Functional Approach: If your codebase follows a functional programming style, using stream operations like IntStream.range fits well with that paradigm.
Advantages of Traditional for Loop:

- ***Familiarity***: Traditional for loops are very familiar to most programmers, so they can be more intuitive and easier to understand for people who are not accustomed to functional programming or streams.
Performance: In some cases, traditional for loops might be slightly more performant, as they don't involve the overhead of stream operations. However, for most cases, the performance difference is negligible and not a primary concern.
- ***Use Cases for IntStream.range***:

IntStream.range is particularly useful in situations where you need to generate a sequence of numbers, iterate over indices, or perform transformations on a range of numbers. Here are some common use cases:

- ***Iterating Over Indices***: When you need to iterate over indices of an array or a collection.
- ***Mapping and Transforming***: When you want to perform a specific operation on each element in a range of numbers and transform them into another value.
- ***Generating Ranges***: When you need to generate a sequence of numbers for various purposes, like initializing arrays or creating numeric ranges.
- ***Functional Approach***: When your code follows a functional programming paradigm and you prefer using stream operations for consistency.
Overall, the choice between IntStream.range and traditional for loops depends on factors such as your coding style, the readability of your code, and the context of your program. Both approaches have their merits, and you can use the one that best fits the goals of your codebase and your team's preferences.