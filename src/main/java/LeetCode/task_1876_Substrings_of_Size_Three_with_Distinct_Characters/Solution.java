package LeetCode.task_1876_Substrings_of_Size_Three_with_Distinct_Characters;

public class Solution {
    public int countGoodSubstrings(String s) {
        int res = 0;

        for (int right = 2; right < s.length(); right++) {
            if (s.charAt(right - 2) != s.charAt(right - 1) &&
                    s.charAt(right - 1) != s.charAt(right) &&
                    s.charAt(right - 2) != s.charAt(right)) {
                res++;
            }
        }

        return res;
    }
}
