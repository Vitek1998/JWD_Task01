package lesson1.task6;

import by.victor.lesson1.task6.TimeFormatChanger;
import org.junit.Assert;
import org.junit.Test;

public class TimeFormatChangerTest {
    @Test //format: hh:mm:ss
    public void timeShouldBeCorrect (){
        String expected = "12:33:22"; // 12 * 3600 + 33 * 60 + 22 = 45202(sec)
        String actual = TimeFormatChanger.getFullTime(45202);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void timeShouldBeCorrect2 (){
        String expected = "00:15:00"; // 15 * 60 = 900
        String actual = TimeFormatChanger.getFullTime(900);
        Assert.assertEquals(expected,actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void secondsShouldBeLessThanInADay(){TimeFormatChanger.getFullTime(86452);}

    @Test(expected = IllegalArgumentException.class)
    public void negativeTimeShouldRaiseException(){TimeFormatChanger.getFullTime(-3557);}
}
