package LeetCode.task_1221_Split_a_String_in_Balanced_Strings;

public class Solution {
    public int balancedStringSplit(String s) {
        int substr = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R'){
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                substr++;
            }
        }
        return substr;
    }
}

