# TASK 
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

``` java 
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

# Example 2:
``` java 
Input: l1 = [0], l2 = [0]
Output: [0]
```

# Example 3:
```java
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

# Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.


# Intuition:
The problem requires adding two numbers represented as linked lists in reverse order and returning the sum as a new linked list. To solve the problem, we can traverse both linked lists simultaneously, add the corresponding digits along with any carry from the previous addition, and create a new linked list with the resulting digits.

# Approach:
* We start by initializing the carry variable to 0, which will be used to store the carry from one digit addition to the next.
* We create a new result linked list with an initial node containing value 0. This initial node will act as a placeholder and facilitate the addition process.
* We create a current pointer and initialize it to point to the initial node of the result linked list. This pointer will help us construct the result linked list.
* We traverse both l1 and l2 linked lists simultaneously using a while loop until either of them becomes null.
* In each iteration of the loop, we retrieve the values of the current nodes of l1 and l2 (or 0 if either is null) and calculate the sum along with the carry from the previous addition.
* We extract the last digit of the sum (i.e., sum % 10) and create a new node with this digit as the value. We attach this new node as the next node to the current pointer in the result linked list.
* We update the current pointer to the newly created node for the next iteration.
* We move the l1 and l2 pointers to their respective next nodes to continue the addition process for the next digits.
* After the loop ends, if there is any carry left, we create a new node with the carry value and add it as the next node in the result linked list.
* Finally, we return the next node of the initial node in the result linked list, effectively skipping the placeholder node with value 0 and returning the actual head of the result linked list.
  # Complexity:
*  O(max(m, n)), where m and n are the number of nodes in the l1 and l2 linked lists, respectively. We traverse each linked list once, and the number of iterations is determined by the larger of the two linked lists.
*  O(max(m, n)), as we create a new linked list of length max(m, n) to store the result, where m and n are the number of nodes in the l1 and l2 linked lists, respectively.




if (nums1.length > nums2.length) {
return findMedianSortedArrays(nums2, nums1);
}

        int m = nums1.length;
        int n = nums2.length;
        int totalElements = m + n;
        int left = 0;
        int right = m;

        while (left <= right) {
            int partitionX = (left + right) / 2;
            int partitionY = (totalElements + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];

            int minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            int minY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if (totalElements % 2 == 0) {
                    return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return (double) Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                right = partitionX - 1;
            } else {
                left = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}