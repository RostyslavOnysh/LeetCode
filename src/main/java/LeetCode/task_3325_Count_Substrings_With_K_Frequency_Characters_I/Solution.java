package LeetCode.task_3325_Count_Substrings_With_K_Frequency_Characters_I;

class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int result = 0;

        for (int start = 0; start < n; start++) {
            int[] freq = new int[26];
            for (int end = start; end < n; end++) {
                freq[s.charAt(end) - 'a']++;
                if (hasCharAtLeastK(freq, k)) {
                    result++;
                }
            }
        }
        return result;
    }

    private boolean hasCharAtLeastK(int[] freq, int k) {
        for (int count : freq) {
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
}