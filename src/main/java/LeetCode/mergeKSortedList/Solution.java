package LeetCode.mergeKSortedList;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;

        if (length == 0) {
            return null;
        }
        if (length == 1) {
            return lists[0];
        }

        return mergeKLists(lists, 0, length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int mid = (start + end) / 2;
        ListNode left = mergeKLists(lists, start, mid);
        ListNode right = mergeKLists(lists, mid + 1, end);

        return mergeTwoList(left, right);
    }

    private ListNode mergeTwoList(ListNode firstList, ListNode secondList) {
        if (firstList == null) {
            return secondList;
        }
        if (secondList == null) {
            return firstList;
        }
        if (firstList.val < secondList.val) {
            firstList.next = mergeTwoList(firstList.next, secondList);
            return firstList;
        } else {
            secondList.next = mergeTwoList(firstList, secondList.next);
            return secondList;
        }
    }
}