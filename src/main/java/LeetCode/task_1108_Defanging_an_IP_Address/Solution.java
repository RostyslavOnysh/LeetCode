package LeetCode.task_1108_Defanging_an_IP_Address;

public class Solution {
    public String defangAddress(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}


/*
OR

return address.replace(".", "[.]");
 */