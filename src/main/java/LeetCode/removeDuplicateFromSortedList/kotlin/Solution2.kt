package LeetCode.removeDuplicateFromSortedList.kotlin

class Solution2 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        while (current != null && current.next != null) {
            if (current.`val` == current.next?.`val`) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }
        return head
    }
    fun printLinkedList(head: ListNode?) {
        var current = head
        while (current != null) {
            print("${current.`val`} -> ")
            current = current.next
        }
        println("null")
    }

    fun main() {
        val solution = Solution2()

        // Create a sample linked list
        val head = ListNode(1)
        head.next = ListNode(1)
        head.next!!.next = ListNode(2)
        head.next!!.next!!.next = ListNode(3)
        head.next!!.next!!.next!!.next = ListNode(3)

        // Print the original linked list
        println("Original Linked List:")
        printLinkedList(head)

        // Call the deleteDuplicates function
        val newHead = solution.deleteDuplicates(head)

        // Print the modified linked list after removing duplicates
        println("Modified Linked List:")
        printLinkedList(newHead)
    }
}