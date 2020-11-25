package lesson1.task10;
import by.victor.lesson1.task10.StepFunctionEvaluator;
import org.junit.Assert;
import org.junit.Test;
import static java.lang.Math.tan;
import static java.lang.Math.PI;

public class StepFunctionEvaluatorTest {
    @Test
    public void stepFunctionResultShouldBeCorrect (){
        double[][] expected = {{0.0,1.0,2.0,3.0,PI},   // x = [0,pi]
                {tan(0.0),tan(1.0),tan(2.0),tan(3.0),tan(PI)}};
        double[][] actual = StepFunctionEvaluator.countF(0.0,PI,1.0);
        Assert.assertArrayEquals(expected[0],actual[0],1e-9);
        Assert.assertArrayEquals(expected[1],actual[1],1e-9);
    }

    @Test
    public void stepFunctionResultShouldBeCorrect2 (){
        double[][] expected = {{-5.0,-4.88,-4.76,-4.7},      // x = [-5,-4.7]
                {tan(-5.0),tan(-4.88),tan(-4.76),tan(-4.7)}};
        double[][] actual = StepFunctionEvaluator.countF(-5.0,-4.7,0.12);
        Assert.assertArrayEquals(expected[0],actual[0],1e-9);
        Assert.assertArrayEquals(expected[1],actual[1],1e-9);
    }

    @Test (expected = IllegalArgumentException.class)
    public void negativeStepValueShouldRaiseException(){
        StepFunctionEvaluator.countF(1.0,2.7,-1.3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void incorrectStepValueShouldRaiseException(){
        StepFunctionEvaluator.countF(1.0,2.0,2.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void zeroStepValueShouldRaiseException(){
        StepFunctionEvaluator.countF(1.0,2.0,0.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void incorrectIntervalShouldRaiseException(){
        StepFunctionEvaluator.countF(0.0,-1.1,0.2);
    }






}
