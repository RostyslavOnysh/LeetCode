package hackerrank.strings;

public class CamelCase {

    public static int camelcase(String s) {
    /*    int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

     */
        return s.matches("[a-z]") ? 1 : s.replaceAll("[a-z]", "").length() + 1;
    }
}