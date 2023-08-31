package LeetCode.lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int length = s.length();

        for (int i = length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                return words[i].length();
            }
        }
        return 0;
    }
}





