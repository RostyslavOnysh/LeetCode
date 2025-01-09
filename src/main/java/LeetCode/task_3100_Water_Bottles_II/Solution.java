package LeetCode.task_3100_Water_Bottles_II;

public class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum = numBottles, bottle = numBottles;
        while (bottle >= numExchange) {
            bottle -= numExchange;
            numExchange++;
            sum++;
            bottle++;
        }
        return sum;
    }
}
