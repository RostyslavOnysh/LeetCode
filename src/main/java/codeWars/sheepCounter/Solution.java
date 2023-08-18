package codeWars.sheepCounter;

public class Solution   {
    public static String countingSheep(int num) {
       StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            builder.append(i).append(" sheep...");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}


