package LeetCode.task_1876_Substrings_of_Size_Three_with_Distinct_Characters;

public class Solution {
    public int countGoodSubstrings(String s) {
        int res = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (right - left + 1 == 3) {
                if (s.charAt(left) != s.charAt(right)
                        && s.charAt(left + 1) != s.charAt(left + 2)
                        && s.charAt(left) != s.charAt(left + 2)) {
                    res++;
                }
                left++;
            }
        }
        return res;
    }
}
