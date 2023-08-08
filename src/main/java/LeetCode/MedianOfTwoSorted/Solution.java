package LeetCode.MedianOfTwoSorted;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        Arrays.sort(merged);

        if ((m + n) % 2 == 0) {
            int mid1 = (m + n) / 2 - 1;
            int mid2 = (m + n) / 2;
            return (merged[mid1] + merged[mid2]) / 2.0;
        } else {
            int mid = (m + n) / 2;
            return merged[mid];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        Solution solution = new Solution();
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
