package LeetCode.task557_ReverseWordsInAStringIII;

public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }
        return String.join(" ", words);
    }

    private static String reverseWord(String word) {
        char[] chars = word.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "Let's take LeetCode contest";
        String s2 = "Mr Ding";

        System.out.println(reverseWords(s1)); // Output: "s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords(s2)); // Output: "rM gniD"
    }
}