package LeetCode.task_125_ValidPalindrome;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindrome(s1)); // Output: true
        System.out.println(isPalindrome(s2)); // Output: false
        System.out.println(isPalindrome(s3)); // Output: true
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        //     StringBuilder reversed = new StringBuilder(sb).reverse(); // Reverse the StringBuilder
        //  return sb.toString().equals(reversed.toString());
        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
