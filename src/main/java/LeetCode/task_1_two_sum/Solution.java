package LeetCode.task_1_two_sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int capacity = n * 2;
        int[] keys = new int[capacity];
        int[] values = new int[capacity];
        boolean[] occupied = new boolean[capacity];

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            int index = find(keys, values, occupied, capacity, complement);
            if (index != -1) {
                return new int[]{values[index], i};
            }
            insert(keys, values, occupied, capacity, nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    private int hash(int key, int capacity) {
        return (key & 0x7FFFFFFF) % capacity;
    }

    private void insert(int[] keys, int[] values, boolean[] occupied, int capacity, int key, int value) {
        int index = hash(key, capacity);
        while (occupied[index]) {
            index = (index + 1) % capacity;
        }
        occupied[index] = true;
        keys[index] = key;
        values[index] = value;
    }

    private int find(int[] keys, int[] values, boolean[] occupied, int capacity, int key) {
        int index = hash(key, capacity);
        while (occupied[index]) {
            if (keys[index] == key) {
                return index;
            }
            index = (index + 1) % capacity;
        }
        return -1;
    }
}