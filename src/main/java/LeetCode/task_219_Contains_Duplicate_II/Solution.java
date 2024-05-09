package LeetCode.task_219_Contains_Duplicate_II;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Перевіряємо, чи ми вже зустрічали поточне число
            if (map.containsKey(nums[i])) {
                // Якщо так, перевіряємо різницю між поточним і попереднім індексом
                int prevIndex = map.get(nums[i]);
                if (Math.abs(i - prevIndex) <= k) {
                    return true; // Знайдено такі індекси
                }
            }
            // Зберігаємо або оновлюємо індекс поточного числа
            map.put(nums[i], i);
        }

        return false; // Немає таких індексів
    }
}
