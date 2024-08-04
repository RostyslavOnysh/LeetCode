package LeetCode.task_121_Best_Time_to_Buy_and_Sell_Stock;

public class SolutionV2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int potentialProfit = prices[i] - min;
            if (potentialProfit > maxProfit) {
                maxProfit += potentialProfit;
            }
        }
        return maxProfit;
    }
}