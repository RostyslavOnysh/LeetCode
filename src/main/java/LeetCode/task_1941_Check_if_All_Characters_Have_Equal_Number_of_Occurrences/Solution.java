package LeetCode.task_1941_Check_if_All_Characters_Have_Equal_Number_of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean areOccurrencesEqual(String s) {
        /*       HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int freq = freqMap.get(s.charAt(0));

        for (int count : freqMap.values()) {
            if (count != freq) {
                return false;
            }
        }
        return true;
    }

         */


            HashMap<Character, Integer> frequencyMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
            HashSet<Integer> freqSet = new HashSet<>(frequencyMap.values());

            return freqSet.size() == 1;
        }
    }