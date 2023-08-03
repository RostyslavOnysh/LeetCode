


# Task 

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.



Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


The objective of the twoSum method is to find a pair of indices in the nums array such that the elements at those indices add up to the given target. The method returns the indices as an array of integers.

The code starts by creating an empty HashMap called numIndices. This HashMap will be used to store the elements from the nums array as keys and their corresponding indices as values. The idea is to create a mapping of each element in the array to its index to facilitate quick lookup later.
The code initializes an integer variable index to keep track of the current index while iterating through the nums array.
The first loop iterates through each element in the nums array. In each iteration, it performs the following steps:
a. It calculates the complement of the current number with respect to the target. The complement is the value that, when added to the current number, results in the target. For example, if the current number is num and the target is 6, then the complement would be 6 - num.
b. It checks if the complement is already present in the numIndices HashMap by using the containsKey method. If the complement exists, it means we have found a pair of elements that add up to the target. For example, if numIndices contains the complement 3, it means there is a pair of elements [3, num] that adds up to 6.
c. However, we additionally check if the complement's index is not equal to the current index. This is done to ensure that we are not using the same element twice in the pair. For example, if the nums array is [3, 3] and the target is 6, without this condition, the code might incorrectly return [0, 0], which is the same element used twice.
If a valid pair of elements is found in the first loop, the method returns an array containing the indices of the two elements that form the desired sum.
If no valid pair is found in the first loop, the code proceeds to the second loop.
a. In the second loop, it continues iterating through the nums array.
b. The index variable is updated in each iteration to keep track of the current index.
c. For each number in the nums array, it stores it in the numIndices HashMap with its index as the value. This way, the code builds the mapping between the numbers and their indices in the array.
If no valid pair is found in the second loop either, the method reaches the end and returns null, indicating that no such pair of elements exists in the nums array that adds up to the target.
Why using HashMap here is better than other variants:
Using a HashMap is a highly efficient approach to solve the Two Sum problem because it allows constant-time (O(1)) lookup for elements. The primary advantage of using a HashMap is the fast lookup time, which helps avoid nested loops and reduces the computational overhead. By building a mapping between elements and their indices in the first loop, we can quickly check for the complement's existence in the second loop. This approach has a linear time complexity (O(n)) as we traverse the nums array only once.

The use of a HashMap makes the overall time complexity of the code O(n), which is optimal for solving the Two Sum problem. Additionally, the space complexity of O(n) is acceptable for most practical scenarios, as we need to store the indices of the elements in the HashMap.

In comparison to other variants, which may involve nested loops or sorting the array, using a HashMap is more efficient in terms of time complexity and provides a straightforward and elegant solution to the problem. Hence, the implementation using HashMap is a preferred and efficient choice for solving the Two Sum problem.






Between the two variants, the second one is better in terms of both time and space complexity.

Let's compare both variants:

First Variant:

Time Complexity: O(n^2) - The first loop iterates through the nums array, and for each element, it checks for the complement in the numIndices HashMap, which takes O(n) time in the worst case. Therefore, the overall time complexity is O(n^2).
Space Complexity: O(n) - The first variant uses a HashMap numIndices to store the elements and their indices, resulting in O(n) space complexity.
Second Variant:

Time Complexity: O(n) - The second variant also iterates through the nums array, but it performs only a single pass. The HashMap allows constant time lookup for the complement, which makes the overall time complexity O(n).
Space Complexity: O(n) - The second variant still uses a HashMap numIndices to store the elements and their indices, resulting in the same O(n) space complexity.
Overall, the second variant is more efficient due to its linear time complexity. It uses the HashMap for quick complement lookup, avoiding nested loops and reducing the computational overhead significantly. Both variants provide the correct solution, but the second one is preferable in terms of performance and efficiency, especially for large input arrays.