package LeetCode.closestThirdSum;

import static performanceCheker.Performance.logPerformance;
import java.util.Arrays;

public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        mergeSort(nums);

        // Initialize the closest sum.
        int closestSum = Integer.MAX_VALUE;

        // Iterate over all triplets.
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            // Find the closest sum for the current triplet.
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return closestSum;
                }
            }
        }

        // Return the closest sum.
        return closestSum;
    }

    private static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        logPerformance();
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        int result1 = solution.threeSumClosest(nums1, target1);
        System.out.println("Result 1: " + result1); // Output should be 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        int result2 = solution.threeSumClosest(nums2, target2);
        System.out.println("Result 2: " + result2); // Output should be 0
        logPerformance();
    }
}