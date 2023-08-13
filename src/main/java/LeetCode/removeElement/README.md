# Task
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:
```java    
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
// It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
assert nums[i] == expectedNums[i];
}
```
If all assertions pass, then your solution will be accepted.



# Example 1:
```bash
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
````
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
# Example 2:
```bash
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
```
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
# Constraints:
```bash
0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100
```

```java
public int removeElement(int[] nums, int val) {
int k = 0;
for (int i : nums) {
if (i != val) {
nums[k++] = i;
}
}    
return k;
}
```
# Algorithm Explanation:
1. The algorithm iterates through the nums array using a for-each loop.
* For each element i in the array:
* If i is not equal to val, it's placed at the position indicated by k, and k is incremented.
* If i is equal to val, it's skipped, and k remains unchanged.
* The value of k at the end of the loop represents the length of the new array with non-equal elements.
# Time Complexity:
* The time complexity of this algorithm is O(n), where n is the length of the nums array.
1. In the worst case, the entire array needs to be traversed once to process each element.
2. The for-each loop iterates through each element exactly once.
# Memory Usage:
The algorithm operates in-place, meaning it modifies the existing nums array without creating a new array.
It doesn't use any extra data structures, resulting in minimal memory usage.
# Algorithm Difficulty:
The algorithm's difficulty can be considered low to moderate.
The main logic involves iterating through the array and manipulating indices.
The code uses basic constructs like loops and conditionals, making it understandable for most programmers.