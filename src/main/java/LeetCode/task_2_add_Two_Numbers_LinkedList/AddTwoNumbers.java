package LeetCode.task_2_add_Two_Numbers_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode current = result;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return result.next;
    }

    public static ListNode createLinkedList(int[] digits) {
        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummyHead.next;
    }

    public static int[] linkedListToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        AddTwoNumbers adder = new AddTwoNumbers();

        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});
        int[] result1 = linkedListToArray(adder.addTwoNumbers(l1, l2));
        System.out.println(Arrays.toString(result1)); // Output: [7, 0, 8]

        ListNode l3 = createLinkedList(new int[]{0});
        ListNode l4 = createLinkedList(new int[]{0});
        int[] result2 = linkedListToArray(adder.addTwoNumbers(l3, l4));
        System.out.println(Arrays.toString(result2)); // Output: [0]

        ListNode l5 = createLinkedList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l6 = createLinkedList(new int[]{9, 9, 9, 9});
        int[] result3 = linkedListToArray(adder.addTwoNumbers(l5, l6));
        System.out.println(Arrays.toString(result3)); // Output: [8, 9, 9, 9, 0, 0, 0, 1]
    }
}

