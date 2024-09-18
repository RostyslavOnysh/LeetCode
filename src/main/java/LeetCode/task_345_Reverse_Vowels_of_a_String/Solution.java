package LeetCode.task_345_Reverse_Vowels_of_a_String;

public class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            while (left < right && !isVowel(c[left])) {
                left++;
            }
            while (left < right && !isVowel(c[right])) {
                right--;
            }

            if (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
