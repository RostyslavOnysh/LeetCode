package dailyTask;

public class SumOfSquare {
    public static int getSquareSum(int[] nums) {

            int sumofArray = 0;
           for (int num : nums) {
               sumofArray += num * num;}
        return sumofArray;
    }
}

