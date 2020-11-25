package lesson1.task5;

import by.victor.lesson1.task5.PerfectNumbers;
import org.junit.Assert;
import org.junit.Test;

public class PerfectNumbersTest {
    @Test
    public void resultWithPerfectNumberShouldBeTrue(){
        boolean actual = PerfectNumbers.checkIfPerfect(28);
        Assert.assertTrue(actual);
    }
    @Test
    public void resultWithPerfectNumberShouldBeTrue2(){
        boolean actual = PerfectNumbers.checkIfPerfect(33550336);
        Assert.assertTrue(actual);
    }
    @Test
    public void resultWithNotPerfectNumberShouldBeFalse(){
        boolean actual = PerfectNumbers.checkIfPerfect(115);
        Assert.assertFalse(actual);
    }
    @Test (expected = IllegalArgumentException.class)
    public void numberShouldBeNatural (){ PerfectNumbers.checkIfPerfect(-8);}


}
