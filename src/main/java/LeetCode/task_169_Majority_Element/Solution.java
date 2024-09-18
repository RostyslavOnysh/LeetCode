package LeetCode.task_169_Majority_Element;

public class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (majority == 0) {
                candidate = num;
            }
            majority += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}


// or hasmap


/*
 HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Проходимо по кожному елементу масиву
        for (int num : nums) {
            // Підраховуємо кількість появ числа
            map.put(num, map.getOrDefault(num, 0) + 1);

            // Якщо кількість більше ніж n/2, повертаємо це число
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        // Якщо немає числа, яке зустрічається більше n/2 разів
        throw new IllegalArgumentException("No majority element found");
    }
 */