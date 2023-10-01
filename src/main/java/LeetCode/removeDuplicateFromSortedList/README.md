Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.


# Efficiency: This code has a time complexity of O(n), where n is the number of nodes in the linked list. It iterates through the list once, and for each duplicate element, it simply updates the next pointer to skip that element. This is more efficient than using a HashSet, which would require additional memory and have a potential time complexity of O(n) for insertion and lookup operations.
In-Place: The code modifies the input linked list in-place, which means it doesn't create a new list or allocate additional memory for the result. This is often preferred when you need to conserve memory or are working with large linked lists.
Correctness: The code correctly identifies and removes duplicate elements while preserving the order of the non-duplicate elements. It compares the current node's value with the next node's value and updates the next pointer accordingly.
Here's a step-by-step explanation of the code:

Initialize a current pointer to the head of the linked list.
While the current.next is not null (meaning there are more nodes to check):
Compare the value of the current node (current.val) with the value of the next node (current.next.val).
If they are equal, it means a duplicate is found. To remove the duplicate, simply update the next pointer of the current node to skip the next node: current.next = current.next.next.
If they are not equal, move the current pointer to the next node: current = current.next.
Continue this process until you have checked all nodes in the list.