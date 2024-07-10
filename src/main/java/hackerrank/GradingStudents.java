package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int actGrade : grades) {
            if (actGrade < 38) {
                roundedGrades.add(actGrade);
            }else {
                int nextMultipleOf5 = ((actGrade / 5) + 1) * 5;

                if (nextMultipleOf5 - actGrade < 3) {
                    roundedGrades.add(nextMultipleOf5);
                } else {
                    roundedGrades.add(actGrade);
                }
            }

        }
        return roundedGrades;
    }
}
