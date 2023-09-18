package LeetCode.needleInHaystack;

public class Solution {
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        if (nLength == 0) {
            return 0;
        }

        for (int i = 0; i <= hLength - nLength; i++) {
            boolean found = true;

            for (int j = 0; j < nLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }

        }
        return -1;
    }
}
