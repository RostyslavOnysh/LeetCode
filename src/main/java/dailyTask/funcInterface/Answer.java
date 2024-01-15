package dailyTask.funcInterface;

import java.util.List;

public class Answer {
    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the highest grade for the students with a specific major
    static int findAnswer(List<Student> students, String major) {
        return students.stream().filter(s -> s.getMajor().equals(major))
                .flatMap(s -> s.getGrades().values().stream())
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
    }

}