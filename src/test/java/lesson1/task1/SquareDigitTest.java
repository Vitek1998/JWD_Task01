package lesson1.task1;

import by.victor.lesson1.task1.SquareDigit;
import org.junit.Assert;
import org.junit.Test;

public class SquareDigitTest {

    @Test // 37^2 = 1369 => last number = 9
    public void resultShouldBeCorrect (){
        Integer expected = 9;
        Integer actual = SquareDigit.getLastDigitOfSquare(37);
        Assert.assertEquals(expected,actual);
    }

    @Test // 1*1 = 1, result = 1
    public void shouldWorkWithOne (){
        Integer expected = 1;
        Integer actual = SquareDigit.getLastDigitOfSquare(1);
        Assert.assertEquals(expected,actual);
    }

    @Test // 0*0 = 0, result = 0
    public void shouldWorkWithZero (){
        Integer expected = 0;
        Integer actual = SquareDigit.getLastDigitOfSquare(0);
        Assert.assertEquals(expected,actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullArgumentShouldRaiseException (){SquareDigit.getLastDigitOfSquare(null);}
}
