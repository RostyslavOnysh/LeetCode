package LeetCode.task_228_Summary_Ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                StringBuilder sb = new StringBuilder();
                if (start == nums[i - 1]) {
                    sb.append(start);
                } else {
                    sb.append(start).append("->").append(nums[i - 1]);
                }
                res.add(sb.toString());
                start = nums[i];
            }
        }
        if (start == nums[nums.length - 1]) {
            res.add(String.valueOf(start));
        } else {
            res.add(start + "->" + nums[nums.length - 1]);
        }
        return res;
    }
}