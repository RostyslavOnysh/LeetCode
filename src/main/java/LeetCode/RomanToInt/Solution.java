package LeetCode.RomanToInt;

import java.util.HashMap;

public class Solution {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = values.get(currentChar);

            if (currentValue > prevValue) {
                result += (currentValue - 2 * prevValue);
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}