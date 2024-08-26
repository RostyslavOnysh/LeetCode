package LeetCode.task_1672_Richest_Customer_Wealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;

        for (int i = 0; i < accounts.length; i++) {
            int curr = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curr += accounts[i][j];
            }
            if (curr > res){
                res = curr;
            }
        }
        return res;
    }
}


// i - customer
// j - bank
// Return the wealth that the richest customer has.

//A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.

/*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */