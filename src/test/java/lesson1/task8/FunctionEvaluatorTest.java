package lesson1.task8;

import by.victor.lesson1.task8.FunctionEvaluator;
import org.junit.Assert;
import org.junit.Test;

public class FunctionEvaluatorTest {
    @Test
    public void functionResultShouldBeCorrect (){
        double expected = -1.0;                          //x=5, x>3, -(5^2) + 3*5 + 9 = -1
        double actual = FunctionEvaluator.countF(5.0);
        Assert.assertEquals(expected,actual,1e-9);
    }

    @Test
    public void functionResultShouldBeCorrect2 (){
        double expected = -(1.0/1006.0);                   //x=-10, x<3, 1/((-10)^3 - 6) = -(1/1006)
        double actual = FunctionEvaluator.countF(-10.0);
        Assert.assertEquals(expected,actual,1e-9);
    }

    @Test
    public void functionResultShouldBeCorrect3 (){
        double expected = 9.0;                          //x=3, -(3^2) + 3*3 + 9 = 9
        double actual = FunctionEvaluator.countF(3.0);
        Assert.assertEquals(expected,actual,1e-9);
    }
}
