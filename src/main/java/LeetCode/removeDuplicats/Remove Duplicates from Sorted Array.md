Two-Pointer Approach: Remove Duplicates from Sorted Array

Problem Description:

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Constraints:
1 <= nums.length <= 3 * 10^4
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
Example Output:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,,,,,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4, respectively. It does not matter what you leave beyond the returned k (hence they are represented by underscores).

Algorithm Explanation:

To solve the problem, we use a two-pointer approach:

Initialize two pointers: current and nextUnique.
current is a pointer used to iterate through the elements of the array nums.
nextUnique is a pointer that points to the position where the next unique element should be placed in nums.
We start with current = 1 since the first element is already considered unique.
Iterate through the array nums starting from index 1 (value of current).
Compare the current element nums[i] with the previous element nums[i - 1].
If nums[i] is different from nums[i - 1], it means the element is unique.
Place the current element nums[i] at the position indicated by nextUnique in the array nums.
Increment nextUnique to point to the next position where the next unique element should be placed.
After the iteration, nextUnique will represent the number of unique elements in the array.
Return nextUnique.
Example:

java
Copy code
class Solution {
public int removeDuplicatesFromArray(int[] nums) {
if (nums.length == 0) {
return 0;
}

        int nextUnique = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[nextUnique] = nums[i];
                nextUnique++;
            }
        }

        return nextUnique;
    }
}