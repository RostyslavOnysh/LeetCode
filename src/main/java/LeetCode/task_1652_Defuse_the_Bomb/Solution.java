package LeetCode.task_1652_Defuse_the_Bomb;

public class Solution {
    public int[] decrypt(int[] code, int k) {
        int size = code.length;
        int [] arr = new int[size];
        int count = 0;

        if (k == 0) {
            return arr;
        }

        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                count += code[i % size];
            }
        } else {
            for (int i = 1; i <= -k; i++) {
                count += code[(size - i) % size];
            }
        }

        for (int i = 0; i < size;i++) {
            arr[i] = count;

            if (k > 0) {
                count -= code[(i + 1) % size];
                count += code[(i + k + 1) % size];
            } else {
                count -= code[(i + size + k) % size];
                count += code[(i + size) % size];
            }
        }
        return arr;
    }
}