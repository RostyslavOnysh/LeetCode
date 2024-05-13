package LeetCode.task_1_twoSum;

import java.util.HashMap;

public class SecondVariant {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        int index = 0;
        for (int num : nums) {
            int complement = target - num;
            int complementIndex =
                    numIndices.containsKey(complement) ? numIndices.get(complement) : -1;
            if (complementIndex != -1 && complementIndex != index) {
                return new int[]{complementIndex, index};
            }
            numIndices.put(num, index);
            index++;
        }

        return null;
    }
}
