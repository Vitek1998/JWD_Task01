package by.victor.lesson1.task6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatChanger {
    private static final long FULL_DAY = 86400; // = 24h
    public static String getFullTime (long seconds){
        if (seconds < 0 || seconds > FULL_DAY) {
            throw new IllegalArgumentException("It could be from 0 to 86400 seconds in one day");
        }
        else {
            return LocalTime.MIN.plusSeconds(seconds).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
    }
}
