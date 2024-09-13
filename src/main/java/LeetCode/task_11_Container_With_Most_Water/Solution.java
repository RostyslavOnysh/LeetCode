package LeetCode.task_11_Container_With_Most_Water;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;

        while (left < right) {
            int minHeight = height[left] < height[right] ? height[left] : height[right];
            int area = minHeight * (right - left);

            if (area > res) {
                res = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.gc();
        return res;
    }
}
