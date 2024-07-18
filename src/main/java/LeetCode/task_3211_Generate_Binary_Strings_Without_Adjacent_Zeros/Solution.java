package LeetCode.task_3211_Generate_Binary_Strings_Without_Adjacent_Zeros;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> res = new ArrayList<>();

    private void backtrack(int prev, StringBuilder sb, int n) {
        if (sb.length() == n) {
            res.add(sb.toString());
            return;
        }

        sb.append('1');
        backtrack(1, sb, n);
        sb.deleteCharAt(sb.length() - 1);
        if (prev == 1) {
            sb.append('0');
            backtrack(0, sb, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
    /*  List<String> result = new ArrayList<>();
    public List<String> validStrings(int n) {
    char [] s = new char[n];
    for (int i = 0;i < n; i++) {
     s[i] = '0';
    }
     backtrack(0, false, s);
     return result;
    }

    private void backtrack(int index, boolean flag, char [] chars) {
    if (index == chars.length) {
    result.add(new String(chars));
    return;
}


    if (!flag) {
    backtrack(index + 1, true,chars);
}

    chars[index] = '1';
    backtrack(index + 1, false, chars);
    chars[index] = '0';
    }
}

     */