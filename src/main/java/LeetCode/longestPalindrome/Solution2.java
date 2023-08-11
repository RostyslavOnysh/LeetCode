package LeetCode.longestPalindrome;

public class Solution2 {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (char c : s.toCharArray()) {
            sb.append(c);
            sb.append("#");
        }
        String str = sb.toString();

        int n = str.length();
        int[] P = new int[n];

        int center = 0;
        int right = 0;

        int maxLen = 0;
        int maxCenter = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                P[i] = Math.min(right - i, P[mirror]);
            }

            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while (a < n && b >= 0 && str.charAt(a) == str.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }

            if (i + P[i] > right) {
                center = i;
                right = i + P[i];
                if (P[i] > maxLen) {
                    maxLen = P[i];
                    maxCenter = i;
                }
            }
        }
        int start = (maxCenter - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        // Test cases
        String input1 = "babad";
        String result1 = solution.longestPalindrome(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + result1);

        String input2 = "cbbd";
        String result2 = solution.longestPalindrome(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + result2);
    }
}

