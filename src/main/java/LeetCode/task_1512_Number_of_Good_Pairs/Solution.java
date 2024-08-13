package LeetCode.task_1512_Number_of_Good_Pairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }


        int res = 0;
        for (int count : freqMap.values()) {
            if (count > 1) {
                res += (count * (count - 1)) / 2;
            }
        }
        return res;
    }
}