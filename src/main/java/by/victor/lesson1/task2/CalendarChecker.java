package by.victor.lesson1.task2;

import java.time.LocalDate;

public class CalendarChecker {
    // It doesn't matter which dayOfMount was taken, so it is 1
    final private static int DAYOFMONTH = 1;

    public static Integer getDayCount(Integer year, Integer monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            throw new IllegalArgumentException("Month should be from 01 to 12");
        LocalDate actualDate = LocalDate.of(year, monthNumber, DAYOFMONTH);
        return actualDate.lengthOfMonth();
    }
}
