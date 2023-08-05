# Task 
Для тебе вже написаний клас ListNode, який використовується для побудови однозв'язних списків в цьому завданні:
```java
class ListNode {
int value;
ListNode next;

ListNode() {}

ListNode(int value) {
this.value = value;
}

ListNode(int value, ListNode next) {
this.value = value;
this.next = next;
}
}
```

Є head, який є вузлом посилання на однозв'язний список. Значення кожного вузла у зв'язному списку дорівнює або 0, або 1. У зв'язному списку зберігається двійкове подання числа.

Реалізуй метод getDecimalValue(), який повертає десяткове значення числа у зв'язному списку.

# Приклади:

[1, 0, 1] повертає 5 // (101) за основою 2 дорівнює (5) за основою 10
[1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0] повертає 18880

```java 
public int getDecimalValue(ListNode head) {
int decimalValue = 0;

    while (head != null) {
        decimalValue = decimalValue * 2 + head.value;
        head = head.next;
    }

    return decimalValue;
}
```
# Algorithm Explanation:

* We have an input parameter head, which is a pointer to the first node of the linked list.
* Initialize the decimalValue variable to store the decimal value of the binary number.
* Start a while loop that runs until we reach the end of the list (when head becomes null).
* In the loop:
1. Multiply the current decimalValue by 2 (shift left by one bit) and add the value of the current node (head.value), which can be either 0 or 1.
2. Move head to the next node using head = head.next
* After the loop completes, return the obtained decimal value.

# Reasoning Behind This Approach:

To convert a binary number to decimal, we can use "left shifts" and "bit addition." At each step, we multiply the current decimalValue by 2 (equivalent to shifting left) and add the current bit. This allows us to efficiently convert the binary number to decimal without the need for any additional data structures.
Using this approach allows us to maintain low algorithmic complexity. Since each bit is processed only once, the time complexity is O(n), where n is the number of bits in the list. This is an optimal result, as the task requires processing all bits.
Algorithmic Complexity:

# Time Complexity: 
O(n), where n is the number of bits in the list. We traverse each bit only once.
# Space Complexity:
Constant additional memory is used for variables, i.e., O(1).
This code is efficient as it adheres to the task's requirements and provides an optimal algorithmic and memory complexity for the given problem.




