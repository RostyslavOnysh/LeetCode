package LeetCode.task_3258_Count_Substrings_That_Satisfy_K_Constraint_I;

class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0, zeroCount = 0, oneCount = 0, res = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') {
                zeroCount++;
            }else {
                oneCount++;
            }
            while (zeroCount > k && oneCount > k) {
                if (s.charAt(left) == '0') {
                    zeroCount--;
                }else {
                    oneCount--;
                }
                left++;
            }
            res += (right - left + 1);
        }
        return res;
    }
}
