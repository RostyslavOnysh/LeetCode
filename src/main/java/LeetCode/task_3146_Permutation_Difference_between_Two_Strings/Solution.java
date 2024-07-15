package LeetCode.task_3146_Permutation_Difference_between_Two_Strings;

public class Solution {
    int diff = 0;

    public int permutationDifference(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            diff += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return diff;
    }
}

/*
       int[] sCache = new int[26];
        int[] tCache = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCache[s.charAt(i)-'a'] = i;
            tCache[t.charAt(i)-'a'] = i;
        }
        int res = 0;
        for (int i = 0; i < sCache.length; i++)
            res += Math.abs(sCache[i]-tCache[i]);
        return res;
    }
}


    int result = 0;
    Map<Character, Integer> value = new HashMap<>();

    for (int i = 0; i < t.length(); i++) {
         value.put(t.charAt(i), i);
    }

    for (int k = 0; k < s.length(); k++) {
        result += Math.abs(k - value.get(s.charAt(k)));

    }

    return result;

    }
 */
