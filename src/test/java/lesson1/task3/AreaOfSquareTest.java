package lesson1.task3;

import by.victor.lesson1.task3.AreaOfSquare;
import org.junit.Assert;
import org.junit.Test;


public class AreaOfSquareTest {
    @Test
    public void areaResultShouldBeCorrect (){
        Double expected = 22.5;
        Double actual = AreaOfSquare.getArea(45.0);
        Assert.assertEquals(expected,actual,1e-9);
    }
    @Test (expected = IllegalArgumentException.class)
    public void negativeAreaShouldRaiseException (){ AreaOfSquare.getArea(-5.0);}

    @Test (expected = IllegalArgumentException.class)
    public void nullAreaShouldRaiseException() { AreaOfSquare.getArea(null);}

}


