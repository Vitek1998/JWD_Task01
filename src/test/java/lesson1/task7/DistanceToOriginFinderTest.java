package lesson1.task7;

import by.victor.lesson1.task7.DistanceToOriginFinder;
import org.junit.Assert;
import org.junit.Test;

public class DistanceToOriginFinderTest {
    @Test
    public void shortestWayShouldBeCorrect (){
        double[] dot1 = {2.0,3.0}; // ~3.6
        double[] dot2 = {5.5,0.7}; // ~5.5
        double[] actual = DistanceToOriginFinder.getClosest(dot1,dot2);
        Assert.assertArrayEquals(dot1,actual,1e-9);
    }
    @Test
    public void shortestWayShouldBeCorrect2 (){
        double[] dot1 = {-15.3,7.1}; // ~16.9
        double[] dot2 = {3.5,5.0}; // ~6.1
        double[] actual = DistanceToOriginFinder.getClosest(dot1,dot2);
        Assert.assertArrayEquals(dot2,actual,1e-9);
    }

    @Test
    public void ifLengthIsSame (){
        double[] dot1 = {2.0,3.0}; // ~3.6
        double[] dot2 = {3.0,2.0}; // ~3.6
        double[] actual = DistanceToOriginFinder.getClosest(dot1,dot2);
        double[] expected = new double[] {dot1[0],dot1[1],dot2[0],dot2[1]};
        Assert.assertArrayEquals(expected,actual,1e-9);
    }

    @Test (expected = IllegalArgumentException.class)
    public void illegalFormOfArraysShouldRaiseException (){
        DistanceToOriginFinder.getClosest(new double[]{1.0,2.0,4.0},new double[]{2.3});
    }


}
