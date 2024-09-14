package LeetCode.task_217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
     Set<Integer> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!res.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
