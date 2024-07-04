package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] freqA = new int[26]; // Since only lowercase English alphabets are considered
        int[] freqB = new int[26];

        for (char ch : a.toCharArray()) {
            freqA[ch - 'a']++;
        }

        for (char ch : b.toCharArray()) {
            freqB[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freqA[i] != freqB[i]) {
                return false;
            }
        }
        return true;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();

        boolean result = isAnagram(a, b);
        if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
