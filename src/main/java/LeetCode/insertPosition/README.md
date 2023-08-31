# Intuition 🔸
The intuition behind this solution is to use Java's Stream API to create a stream of array elements and then apply operations on that stream to find the index where the target should be inserted into a sorted array while maintaining the sorted order.

# Approach 🔸
- Arrays.stream(nums): This converts the given integer array nums into an IntStream, allowing stream operations to be performed on the array elements.
- .takeWhile(num -> num < target): The takeWhile operation is used to create a new stream that includes only the initial elements from the original stream that satisfy the given condition. In this case, it takes elements that are less than the target value.
- .count(): This terminal operation is used to count the number of elements in the stream. Since the takeWhile operation only keeps elements less than the target, the count represents the number of elements in the stream that are strictly smaller than the target

# Complexity 🔸
- Time complexity: ✈️
  ***O(n)***, where ***n*** is the number of elements in the ***nums*** array. The *Arrays.stream(nums)* operation takes *O(n)* time, and the subsequent operations (takeWhile and count) also take O(n) time in the worst case.

- Space complexity: 🚀
  ***O(1)*** because no additional data structures are used that depend on the input size.

# Code 🔸
```
class Solution {
    public int searchInsert(int[] nums, int target) {
      return (int) Arrays.stream(nums)
                .takeWhile(num -> num < target)
                .count();
    }
}
```

![816720feb58f498128e1213bb5178309.jpg](https://assets.leetcode.com/users/images/c4e38672-27d2-4db6-90ee-bf0f8873dfd8_1693501786.385981.jpeg)
