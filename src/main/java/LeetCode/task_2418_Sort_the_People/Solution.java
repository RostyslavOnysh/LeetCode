package LeetCode.task_2418_Sort_the_People;

import java.util.Arrays;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String [] s = new String[100001];

        for (int i = 0; i < names.length; i++) {
            s[heights[i]] = names[i];
        }
        Arrays.sort(heights);
        String r [] = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            r[i] = s[heights[names.length - 1 - i]];
        }
        return r;
    }
}

/*
   Map<Integer, String> people = new HashMap<>();
    for (int i = 0; i < names.length; i++) {
        people.put(heights[i], names[i]);
    }
    Arrays.sort(heights);
    for (int i = 0; i < heights.length; i++) {
        names[names.length - i - 1] = people.get(heights[i]);
    }
    System.gc();
    return names;
  }
}
 */