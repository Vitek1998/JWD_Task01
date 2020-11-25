package lesson1.task2;

import by.victor.lesson1.task2.CalendarChecker;
import org.junit.Assert;
import org.junit.Test;

public class CalendarCheckerTest {
    @Test // It is 30 days in November 2020
    public void countOfDaysShouldBeCorrect (){
        Integer expected = 30;
        Integer actual = CalendarChecker.getDayCount(2020,11);
        Assert.assertEquals(expected,actual);
    }

    @Test // It was 29 days in February 1956
    public void countOfDaysInLeapYearShouldBeCorrect () {
        Integer expected = 29;
        Integer actual = CalendarChecker.getDayCount(1956,2);
        Assert.assertEquals(expected,actual);
    }

    @Test // It will be 31 days in March 2036
    public void countOfDaysInFutureYearShouldBeCorrect () {
        Integer expected = 31;
        Integer actual = CalendarChecker.getDayCount(2036,3);
        Assert.assertEquals(expected,actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void incorrectMonthNumberShouldRaiseException (){
        CalendarChecker.getDayCount(1772,18);
    }
}