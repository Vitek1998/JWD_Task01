package by.victor.lesson1.task10;

import java.util.Arrays;

public class StepFunctionEvaluator {
    public static double[][] countF (double a, double b, double h){
        if (a >= b || (b-a) < h || h <= 0.0 ) {
            throw new IllegalArgumentException("Steps from a to b can't be constructed");
        }
        double[] argumentArr = new double[ (int)Math.ceil((b-a)/h) + 1 ];
        Arrays.setAll(argumentArr, i -> i != argumentArr.length - 1 ? a + (i * h) : b);
        double[] fValuesArr = Arrays.stream(argumentArr).map(Math::tan).toArray();
        return new double[][] {argumentArr, fValuesArr};
    }
}
