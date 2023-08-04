package codeWars;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class CountTheDays {
    public String countDays(Date d) {
        LocalDateTime date = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        Duration duration = Duration.between(LocalDateTime.now(), date);
        long days = duration.toDays(); 
        return (days == 0) ? "Today is the day!" : (days < 0) ? "The day is in the past!" : days + " days";
    }
}
