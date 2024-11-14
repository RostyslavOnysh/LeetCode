package LeetCode.task_3325_Count_Substrings_With_K_Frequency_Characters_I;

class Solution {
            public int numberOfSubstrings(String s, int k) {
                int n = s.length();
                int result = 0;

                for (int start = 0; start < n; start++) {
                    int[] freq = new int[26];
                    boolean found = false;
                    for (int end = start; end < n; end++) {
                        freq[s.charAt(end) - 'a']++;
                        if (freq[s.charAt(end) - 'a'] >= k) {
                            found = true;
                        } else {
                            for (int i = 0; i < 26; i++) {
                                if (freq[i] >= k) {
                                    found = true;
                                    break;
                                }
                            }
                        }
                        if (found) {
                            result += n - end;
                            break;
                        }
                    }
                }
                return result;
            }
        }