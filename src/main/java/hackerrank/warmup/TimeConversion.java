package hackerrank.warmup;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String minute = s.substring(3, 5);
        String second = s.substring(6, 8);
        String period = s.substring(8, 10);

        if (period.equals("AM") && hour == 12) {
            hour = 0;
        } else if (period.equals("PM") && hour != 12) {
            hour += 12;
        }

        return String.format("%02d:%s:%s", hour, minute, second);
    }
}

/*
DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
    DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

    LocalTime time = LocalTime.parse(s, inputFormat);
    return time.format(outputFormat);
 */