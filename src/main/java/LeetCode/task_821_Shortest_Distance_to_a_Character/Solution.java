package LeetCode.task_821_Shortest_Distance_to_a_Character;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int [] ans = new int[s.length()];
        int prevIndex = Integer.MIN_VALUE / 2;

        for (int i = 0;i < s.length(); i++) {
            if (s.charAt(i) == c) {
                prevIndex = i;
            }
            ans[i] = i - prevIndex;
        }

        prevIndex = Integer.MAX_VALUE / 2;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prevIndex = i;
            }

            ans[i] = Math.min(ans[i], prevIndex - i);
        }
        return ans;
    }
}
