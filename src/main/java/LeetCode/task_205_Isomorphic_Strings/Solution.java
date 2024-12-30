package LeetCode.task_205_Isomorphic_Strings;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int [] mapST = new int [256];
        int [] mapTS = new int [256];

        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (mapST[sChar] == 0 && mapTS[tChar] == 0) {
                mapST[sChar] = tChar;
                mapTS[tChar] = sChar;
            }else {
                if (mapST[sChar] != tChar || mapTS[tChar] != sChar) {
                    return false;
                }
            }
        }
        return true;
    }
}