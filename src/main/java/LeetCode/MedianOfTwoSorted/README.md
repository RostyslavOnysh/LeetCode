# Task 
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



# Example 1:
```java
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
```
Explanation: merged array = [1,2,3] and median is 2.
# Example 2:
```java
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
```
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


# Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

# Intuition 📖

The problem asks to find the median of two sorted arrays nums1 and nums2. Since the arrays are already sorted, we can combine them into a single sorted array and then find the median based on the length of the combined array.

# Approach🚀 ✈️

Get the lengths of the input arrays nums1 and nums2 and store them in variables m and n respectively.
Create a new array called merged of size m + n to hold the merged elements from both nums1 and nums2.
Use System.arraycopy to copy the elements of nums1 into the merged array starting from index 0 and copy the elements of nums2 into the merged array starting from index m (the end of nums1).
Sort the merged array using Arrays.sort.
Check if the total length of the combined array (m + n) is even or odd by checking (m + n) % 2 == 0.
If the total length is even:
a. Calculate the indices of the two middle elements as mid1 = (m + n) / 2 - 1 and mid2 = (m + n) / 2.
b. Return the average of the two middle elements as the median, calculated as (merged[mid1] + merged[mid2]) / 2.0.
If the total length is odd:
a. Calculate the index of the middle element as mid = (m + n) / 2.
b. Return the middle element directly as the median, calculated as merged[mid].
# Complexity ❗ ‼️

Time complexity:
O((m + n) log (m + n)), where m and n are the lengths of nums1 and nums2 respectively. The time complexity is dominated by the sorting step.

Space complexity:
O(m + n), as we create a new array merged of size m + n to hold the merged elements from both arrays

```java

class Solution {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int m = nums1.length;
int n = nums2.length;
int[] merged = new int[m + n];

        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        Arrays.sort(merged);

      
        if ((m + n) % 2 == 0) {
            int mid1 = (m + n) / 2 - 1;
            int mid2 = (m + n) / 2;
            return (merged[mid1] + merged[mid2]) / 2.0;
        } else {
            int mid = (m + n) / 2;
            return merged[mid];
        }
    }
}
 ```
