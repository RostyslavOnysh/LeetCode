package dailyTask.binaryNumberConverter;

public class BinaryNumberConverter {
    public static int getDecimalValue(ListNode head) {
        int decimalValue = 0;

        while (head != null) {
           decimalValue = decimalValue * 2 + head.value;
           head = head.next;
        }
        return decimalValue;
    }
}
