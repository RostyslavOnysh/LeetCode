package LeetCode.removeDuplicateFromSortedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if (head == null) {
            return null;
        }
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        // Initialize linked list with values 1, 2, 2, 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next
                = new ListNode(3);
        ListNode BeforePrinter = head;
        System.out.println(
                "Before removing duplicates linked list is:");
        while (BeforePrinter != null) {
            System.out.print(BeforePrinter.val + " ");
            BeforePrinter = BeforePrinter.next;
        }
        System.out.println();

        Solution solution = new Solution();
        // Remove duplicates from the linked list using the
        // deleteDuplicates function
        head = solution.deleteDuplicates(head);

        // Print the linked list after removing duplicates
        System.out.println(
                "After removing duplicates linked list is:");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}