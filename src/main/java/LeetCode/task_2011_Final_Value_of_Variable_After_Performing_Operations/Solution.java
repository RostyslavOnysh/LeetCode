package LeetCode.task_2011_Final_Value_of_Variable_After_Performing_Operations;

public class Solution {
    public int finalValueOfOperations(String [] operations) {
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                sum++;
            } else if (operations[i].equals("X--") || operations[i].equals("--X")) {
                sum--;
            }
        }
        return sum;
    }
}
