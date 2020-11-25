package by.victor.lesson1.task4;

import java.util.Arrays;

public class CheckForEvenNumbers {
    public static boolean checkIfTwoEven (int a, int b, int c, int d){
        int[] numbersArr = {a,b,c,d};
        int evenCount = Arrays.stream(numbersArr).filter(e -> e % 2 == 0).toArray().length;
        return evenCount >= 2;
    }
}
