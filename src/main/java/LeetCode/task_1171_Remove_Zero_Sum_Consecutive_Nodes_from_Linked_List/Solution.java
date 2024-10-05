package LeetCode.task_1171_Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            int prefSum = 0;

            Map<Integer, ListNode> map = new HashMap<>();

            ListNode curr = dummy;

            while (curr != null) {
                prefSum += curr.val;

                if (map.containsKey(prefSum)) {
                    ListNode prev = map.get(prefSum).next;
                    int tempSum = prefSum;

                    while (prev != null && prev != curr) {
                        tempSum += prev.val;
                        map.remove(tempSum);
                        prev = prev.next;
                    }
                    map.get(prefSum).next = curr.next;
                } else {
                    map.put(prefSum, curr);
                }
                curr = curr.next;
            }
            return dummy.next;
        }
    }