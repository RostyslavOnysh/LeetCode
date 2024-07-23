package LeetCode.task_1816._Truncate_Sentence;

public class Solution2 {
    public String truncateSentence(String s, int k) {
        int i = 0;
        int count = 0;
        int n = s.length();
        while (i < n) {
            if (s.charAt(i) == ' ') {
                count++;

                if (count == k) {
                    return s.substring(0,i);
                }
                i++;
            }
        }
        return s;
    }
}
