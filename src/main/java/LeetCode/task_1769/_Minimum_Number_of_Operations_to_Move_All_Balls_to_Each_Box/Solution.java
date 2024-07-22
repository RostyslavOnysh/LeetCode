package LeetCode.task_1769._Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box;

public class Solution {
    public int[] minOperations(String boxes) {
        int length = boxes.length();
        int[] result = new int[length];

        int rightSum = 0;
        int onesAtRight = 0;

        for (int i = 0; i < length; i++) {
            if (boxes.charAt(i) == '1') {
                onesAtRight++;
                rightSum += i;
            }
        }

        int leftSum = 0;
        int onesAtLeft = 0;

        for (int i = 0; i < length; i++) {
            leftSum += onesAtLeft;
            if (boxes.charAt(i) == '1') {
                onesAtRight--;
                onesAtLeft++;
            }
            result[i] = rightSum+leftSum;
            rightSum-= onesAtRight;
        }
        System.gc();
        return result;
    }
}


/*



    public int[] minOperations(String boxes) {
        int length = boxes.length();
        List<Integer> li = new ArrayList<>();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            if (boxes.charAt(i) == '1') {
                li.add(i);
            }
        }
        for (int j = 0; j < length; j++) {
            int currValue = 0;
            for (int n : li) {
                int diff = Math.abs(n - j);
                currValue += diff;
            }
            result[j] = currValue;
        }
        System.gc();
        return result;
    }
 */