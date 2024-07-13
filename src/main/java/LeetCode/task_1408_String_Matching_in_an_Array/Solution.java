package LeetCode.task_1408_String_Matching_in_an_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));

        Set<String> result = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                result.add(words[i]);
                break;
                }
            }
        }
        return  new ArrayList<>(result);
    }
}


/*
   List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                }
            }
        }
        return result;
    }
 */
/*
  List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (isSubstring(words[i], words)) {
                result.add(words[i]);
            }
        }
        return result;
    }

    private boolean isSubstring(String pattern, String[] words) {
        for (String word : words) {
            if (word.equals(pattern)) {
                continue;
            }
            if (boyerMooreSearch(word, pattern) != -1) {
                return true;
            }
        }
        return false;
    }

    private int boyerMooreSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] badChar = buildBadCharTable(pattern);
        int[] goodSuffix = buildGoodSuffixTable(pattern);

        int i = 0;
        while (i <= n - m) {
            int j = m - 1;
            while (j >= 0 && pattern.charAt(j) == text.charAt(i + j)) {
                j--;
            }
            if (j < 0) {
                return i;
            } else {
                i += Math.max(1, j - badChar[text.charAt(i + j)]);
            }
        }
        return -1;
    }

    private int[] buildBadCharTable(String pattern) {
        int[] table = new int[256];

        for (int i = 0; i < 256; i++) {
            table[i] = -1; // initialize all occurrences to -1
        }

        for (int i = 0; i < pattern.length(); i++) {
            table[pattern.charAt(i)] = i; // update the last occurrence of character
        }

        return table;
    }

    private int[] buildGoodSuffixTable(String pattern) {
        int m = pattern.length();
        int[] suffix = new int[m + 1];
        int[] border = computeBorderArray(pattern);

        for (int i = 0; i <= m; i++) {
            suffix[i] = m - border[m - 1];
        }

        for (int i = 0; i < m; i++) {
            int j = m - border[i];
            suffix[j] = Math.min(suffix[j], i - border[i] + 1);
        }

        return suffix;
    }

    private int[] computeBorderArray(String pattern) {
        int m = pattern.length();
        int[] border = new int[m];
        border[0] = 0;
        int j = 0;

        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = border[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            } else {
                j = 0;
            }
            border[i] = j;
        }

        return border;
    }
}
 */