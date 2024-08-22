package LeetCode.task_2037_Minimum_Number_of_Moves_to_Seat_Everyone;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < students.length; j++) {
                res += Math.abs(seats[i] - students[j]);

            }
        }
        return res;
    }
}
