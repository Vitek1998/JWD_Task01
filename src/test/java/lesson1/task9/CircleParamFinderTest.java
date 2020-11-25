package lesson1.task9;

import by.victor.lesson1.task9.CircleParamFinder;
import org.junit.Assert;
import org.junit.Test;

public class CircleParamFinderTest {
    @Test
    public void circleParamsShouldBeCorrect(){
        double[] expected = {2*Math.PI,Math.PI}; // R = 1, C = 2pi, S = pi
        double[] actual = CircleParamFinder.countLengthAndSquare(1.0);
        Assert.assertArrayEquals(expected,actual,1e-9);
    }

    @Test
    public void circleParamsShouldBeCorrect2(){
        double[] expected = {34.4*Math.PI, 295.84*Math.PI}; // R = 17.2, C = 2*17.2*pi, S = pi*(17.2)^2
        double[] actual = CircleParamFinder.countLengthAndSquare(17.2);
        Assert.assertArrayEquals(expected,actual,1e-9);
    }

    @Test (expected = IllegalArgumentException.class)
    public void negativeArgumentShouldRaiseException () {
        CircleParamFinder.countLengthAndSquare(-1.11);
    }
}
