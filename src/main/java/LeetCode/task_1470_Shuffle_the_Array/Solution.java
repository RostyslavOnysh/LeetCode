package LeetCode.task_1470_Shuffle_the_Array;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int [] res = new int[size];

        int i = 0, j = n;
        int counter = 0;

        while (counter < size) {
            if (counter % 2 == 0) {
                res[counter] = nums[i++];
            } else {
                res[counter] = nums[j++];
            }
            counter++;
        }
        return res;
    }
}


// Use two pointers to create the new array of 2n elements.
// The first starting at the beginning and the other starting at (n+1)th position. Alternate between them and create the new array.