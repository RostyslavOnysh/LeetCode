package LeetCode.task_1773._Count_Items_Matching_a_Rule;

import java.util.List;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int NumberOfMatchedItems = 0;
        int j = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        for (List<String> i : items) {
            if (i.get(j).equals(ruleValue)) {
                NumberOfMatchedItems++;
            }
        }
        return NumberOfMatchedItems;
    }
}
   /*     int j = 0;
        switch(ruleKey){
            case "color" -> j = 1;
            case "name" -> j = 2;
        }
        for(List<String> i: items){
            if(i.get(j).equals(ruleValue))NumberOfMatchedItems++;
        }

        return NumberOfMatchedItems;
    }
}

    */