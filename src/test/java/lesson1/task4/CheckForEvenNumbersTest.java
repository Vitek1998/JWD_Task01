package lesson1.task4;

import by.victor.lesson1.task4.CheckForEvenNumbers;
import org.junit.Assert;
import org.junit.Test;


public class CheckForEvenNumbersTest {
    @Test
    public void checkForMoreThenTwoEvens(){
        boolean actual = CheckForEvenNumbers.checkIfTwoEven(5,2,80,8);
        Assert.assertTrue(actual);
    }
    @Test
    public void checkForTwoEvens(){
        boolean actual = CheckForEvenNumbers.checkIfTwoEven(10,19,7,22);
        Assert.assertTrue(actual);
    }
    @Test
    public void checkForLessThanTwoEvens(){
        boolean actual = CheckForEvenNumbers.checkIfTwoEven(25,73,9,82);
        Assert.assertFalse(actual);
    }
    @Test
    public void checkForEvensNegative(){
        boolean actual = CheckForEvenNumbers.checkIfTwoEven(-23,7,-8,20);
        Assert.assertTrue(actual);
    }
}
