# Task 
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
```java
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```
# Example 2:

```java
Input: list1 = [], list2 = []
Output: []
Example 3:
```
# Example 3
```java
Input: list1 = [], list2 = [0]
Output: [0]
```


# Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.



# Intuition
The first thing that comes to mind when you need to merge two linked lists is to use a loop. The loop will allow us to iterate through each element in both lists and add them to a new list in ascending order.

# Approach
Our approach to solving this problem is to use a loop to iterate through each element in both lists and add it to a new list in ascending order. We will use two variables, head1 and head2, to store the current heads of both lists. We will use a loop to check if both lists are not finished yet. If they are not finished yet, we will compare the values of the current elements in the two lists. If the value of the first element is less than the value of the second element, we will add the first element to the new list. If the value of the second element is less than the value of the first element, we will add the second element to the new list. We will continue the loop until both lists are finished. After both lists are finished, the new list will contain all the elements from both lists in ascending order.

# Complexity
* Time complexity:
  of the algorithm for merging two linked lists is O(n + m), where n is the number of elements in the first list and m is the number of elements in the second list. This is because the algorithm iterates through each element in both lists once. The space complexity of the algorithm is O(1), since it does not use any additional memory, besides the memory used to store the new list.

- Space complexity:
  The space complexity of the algorithm is O(1), as it does not use any additional memory besides the memory used to store the new merged list.



# Explanation

The code starts by creating a dummy node dummy and assigning it to the variable tail. A dummy node is a node that does not contain any data, but is used to make the code easier to write. The loop then checks if both lists are not finished yet. If they are not finished yet, the code compares the values of the current nodes in the two lists. If the value of the first node is less than the value of the second node, the code adds the first node to the new list. If the value of the second node is less than the value of the first node, the code adds the second node to the new list. The code continues the loop until both lists are finished. After both lists are finished, the new list will contain all the elements from both lists in ascending order.

# Advantages

The algorithm for merging two sorted linked lists has several advantages:

Simplicity: The algorithm is straightforward and easy to understand, making it accessible for implementation by developers.
Efficiency: With a time complexity of O(n + m), the algorithm efficiently merges two lists without the need for excessive comparisons or additional data structures.
Versatility: The algorithm can be applied to merge lists of any type, not restricted to specific data types.

# Code
```java


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;

            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1 != null ? list1 : list2;

        return dummy.next;
    }
}
```