package LeetCode.task_3318_Find_X_Sum_of_All_K_Long_Subarrays_I;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
        public int[] findXSum(int[] nums, int k, int x) {
            int n = nums.length;
            int[] result = new int[n - k + 1];
            Map<Integer, Integer> freqMap = new HashMap<>();

            for (int i = 0; i < k; i++) {
                freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            }

            for (int i = 0; i <= n - k; i++) {
                result[i] = calculateXSum(freqMap, x);
                if (i + k < n) {
                    int outgoing = nums[i];
                    int incoming = nums[i + k];
                    freqMap.put(outgoing, freqMap.get(outgoing) - 1);
                    if (freqMap.get(outgoing) == 0) {
                        freqMap.remove(outgoing);
                    }
                    freqMap.put(incoming, freqMap.getOrDefault(incoming, 0) + 1);
                }
            }

            return result;
        }

        private int calculateXSum(Map<Integer, Integer> freqMap, int x) {
            PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->
                    a[1] == b[1] ? Integer.compare(b[0], a[0]) : Integer.compare(b[1], a[1]));
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                queue.offer(new int[]{entry.getKey(), entry.getValue()});
            }
            int sum = 0;
            for (int i = 0; i < x && !queue.isEmpty(); i++) {
                int[] entry = queue.poll();
                sum += entry[0] * entry[1];
            }
            return sum;
        }
    }