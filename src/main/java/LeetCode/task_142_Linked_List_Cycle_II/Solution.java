package LeetCode.task_142_Linked_List_Cycle_II;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                ListNode finder = head;
                while (finder != slow) {
                    finder = finder.next;
                    slow = slow.next;
                }
                return finder;
            }
        }

        return null;
    }
}