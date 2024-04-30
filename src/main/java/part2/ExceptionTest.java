package part2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExceptionTest {
    public static void main(String[] args) {
        String date = LocalDate.parse("2016-07-13")
                .plusDays(31)
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
