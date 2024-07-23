package LeetCode.task_1816._Truncate_Sentence;

public class Solution2 {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k)
                    return s.substring(0, i);
            }
            i++;
        }
        return s;
    }
}