package LeetCode.task_1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers;

public class Solution {
    public int minPartitions(String n) {
        int max  = Integer.MIN_VALUE;
        char [] c = n.toCharArray();

        for (char value : c) {
            if (max < value - '0') {
                max = value - '0';
            }
        }
        return max;
    }
}


/*
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
         ans=Math.max(ans,n.charAt(i)-'0');

        }
        return ans;
    }
}
 */