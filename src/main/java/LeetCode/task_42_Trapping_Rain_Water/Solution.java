package LeetCode.task_42_Trapping_Rain_Water;

public class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lM = height[l], rM = height[r];
        int waterTrapped = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= lM) {
                    lM = height[l];
                } else {
                    waterTrapped += lM - height[l];
                }
                l++;
            } else {
                if (height[r] >= rM) {
                    rM = height[r];
                } else {
                    waterTrapped += rM - height[r];
                }
                r--;
            }
        }
        return waterTrapped;
    }
}
