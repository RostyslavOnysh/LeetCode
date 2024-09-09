package LeetCode.task_56_Merge_Intervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[][] merge(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (map.containsKey(start)) {
                map.put(start, Math.max(map.get(start), end));
            } else {
                map.put(start, end);
            }
        }

        List<int[]> merged = new ArrayList<>();

        int currStart = map.firstKey();
        int currEnd = map.get(currStart);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int start = entry.getKey();
            int end = entry.getValue();

            if (start <= currEnd) {
                currEnd = Math.max(currEnd, end);
            } else {
                merged.add(new int[]{currStart, currEnd});
                currStart = start;
                currEnd = end;
            }
        }
        merged.add(new int[]{currStart, currEnd});
        return merged.toArray(new int[merged.size()][]);
    }
}
