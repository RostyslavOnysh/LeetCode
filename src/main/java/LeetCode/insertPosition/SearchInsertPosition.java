package LeetCode.insertPosition;

import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return (int) Arrays.stream(nums)
                .takeWhile(num -> num < target)
                .count();
    }
}