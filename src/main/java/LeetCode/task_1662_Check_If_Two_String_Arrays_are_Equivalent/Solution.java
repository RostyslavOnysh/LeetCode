package LeetCode.task_1662_Check_If_Two_String_Arrays_are_Equivalent;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            result1.append(word1[i]);
        }

        for (int j = 0; j < word2.length; j++) {
            result2.append(word2[j]);
        }

        return result1.toString().equals(result2.toString());
    }
}
