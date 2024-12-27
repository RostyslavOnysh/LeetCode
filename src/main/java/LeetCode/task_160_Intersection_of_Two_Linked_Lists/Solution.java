package LeetCode.task_160_Intersection_of_Two_Linked_Lists;


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB ==  null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = (pA == null) ?  headB : pA.next;
            pB = (pB == null) ?  headA : pB.next;
        }
        return pA;
    }
}