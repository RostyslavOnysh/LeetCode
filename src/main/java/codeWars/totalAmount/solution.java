package codeWars.totalAmount;

public class solution {
    public static int points(String[] games) {
        int totalScore = 0;
        for (String value : games) {
            String[] score = value.split(":");
            int right = Integer.parseInt(score[0]);
            int left = Integer.parseInt(score[1]);

            totalScore += (right > left) ? 3 : (right == left) ? 1 : 0;
        }
        return totalScore;
    }
}
