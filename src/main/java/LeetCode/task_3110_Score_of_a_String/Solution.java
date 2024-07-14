package LeetCode.task_3110_Score_of_a_String;

public class Solution {
    int score = 0;
    public int scoreOfString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
}

/*
 public int scoreOfString(String s) {
        int a=s.length()-1;
    for(int i=0;i<a;i++)
    {
        sum +=Math.abs(s.charAt(i)-s.charAt(i+1));
    }
    return sum;
    }
 */
