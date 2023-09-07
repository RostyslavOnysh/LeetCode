    Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).


Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104


# explanation 

Merge Sort Function (mergeSort):
mergeSort is a recursive function that performs the merge sort algorithm on an input array.
Merge sort is chosen because it guarantees a time complexity of O(n log n), which is efficient and suitable for larger arrays. This sorting algorithm is stable and has good average and worst-case time complexity.
The function recursively divides the input array into two halves, left and right, until each subarray contains only one or zero elements.
Then, it merges the two sorted subarrays back together into a single sorted array using the merge function.
Merge Function (merge):
The merge function takes two sorted arrays (left and right) and merges them into a single sorted array (array).
It uses three pointers: i for the left array, j for the right array, and k for the merged array.
The function compares elements at left[i] and right[j] and selects the smaller element to place into the merged array. This process continues until one of the arrays is exhausted.
Finally, any remaining elements in both left and right are copied into the merged array.
This merging step ensures that the mergeSort function correctly sorts the input array.
threeSumClosest Function:
This is the main function that solves the "Three Sum Closest" problem.
It first sorts the input array nums using the mergeSort function. Sorting the array is crucial for the two-pointer approach that follows.
It initializes closestSum to Integer.MAX_VALUE, which will store the closest sum found during the iteration.
The function then iterates through the sorted array nums using a loop (for (int i = 0; i < nums.length - 2; i++)). This loop selects the first element of the triplet.
Inside the loop, two pointers (left and right) are used to find the remaining two elements of the triplet.
A while loop (while (left < right)) is used to search for the closest sum using the two-pointer approach:
The currentSum is calculated as the sum of nums[i], nums[left], and nums[right].
The absolute difference between currentSum and target is compared with the absolute difference between closestSum and target. If it's smaller, closestSum is updated to currentSum.
Depending on whether currentSum is less than, greater than, or equal to target, the left and right pointers are adjusted to bring the sum closer to the target.
If currentSum is equal to target, the function returns closestSum immediately because it cannot get any closer to the target.
After the loop completes, the function returns closestSum, which holds the closest sum to the target value.
main Function:
The main function demonstrates the use of the threeSumClosest function with two test cases.
It creates an instance of the Solution class and calculates the closest sum for each test case.
The results are printed to the console.
Time Complexity:
The mergeSort function has a time complexity of O(n log n) because it divides the array into halves and then merges them.
The threeSumClosest function iterates through the sorted array, which takes O(n) time.
Overall, the time complexity of the code is dominated by the sorting step, so it's O(n log n).
Space Complexity:
The space complexity of the code is O(n) because it creates additional arrays (left and right) during the merge sort process. The space complexity is linear with respect to the input size.
In summary, this code effectively uses merge sort to sort the input array, which is then used to implement a two-pointer approach for finding the closest sum of three integers to the target value. The merge sort algorithm provides stable and efficient sorting, making it a good choice for this task.