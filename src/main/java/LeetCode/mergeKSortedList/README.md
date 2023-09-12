# Task 
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.



Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
1->4->5,
1->3->4,
2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []


Constraints:

k == lists.length
0 <= k <= 104
0 <= lists[i].length <= 500
-104 <= lists[i][j] <= 104
lists[i] is sorted in ascending order.
The sum of lists[i].length will not exceed 104.



# Explanation 
/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
  */
  class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
  // Check for edge cases where there are no lists or only one list.
  int length = lists.length;
  if (length == 0) {
  return null;
  }
  if (length == 1) {
  return lists[0];
  }

       // Use a divide and conquer approach to merge the lists.
       return mergeKLists(lists, 0, length - 1);
  }

  // This recursive function takes a range of lists and merges them.
  private ListNode mergeKLists(ListNode[] lists, int start, int end) {
  // Base case: If there's only one list in the range, return it.
  if (start == end) {
  return lists[start];
  }

       // Find the middle index to split the range.
       int mid = (start + end) / 2;

       // Recursively merge the left and right halves of the range.
       ListNode left = mergeKLists(lists, start, mid);
       ListNode right = mergeKLists(lists, mid + 1, end);

       // Merge the two sorted lists using a helper function.
       return mergeTwoLists(left, right);
  }

  // Helper function to merge two sorted linked lists.
  private ListNode mergeTwoLists(ListNode firstList, ListNode secondList) {
  // Base cases: If one list is null, return the other list.
  if (firstList == null) {
  return secondList;
  }
  if (secondList == null) {
  return firstList;
  }

       // Compare the values of the current nodes in the two lists.
       if (firstList.val < secondList.val) {
           // If the first list's value is smaller, merge it with the rest of the first list.
           firstList.next = mergeTwoLists(firstList.next, secondList);
           return firstList;
       } else {
           // If the second list's value is smaller or equal, merge it with the rest of the second list.
           secondList.next = mergeTwoLists(firstList, secondList.next);
           return secondList;
       }
  }
  }