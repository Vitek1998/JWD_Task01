package by.victor.lesson1.task8;

public class FunctionEvaluator {
    public static double countF (double x) { return x >= 3 ? f1(x) : f2(x); }

    private static double f1 (double x) { return ((-1.0)*x*x) + (3.0*x) + 9.0; }
    private static double f2 (double x) { return 1/(Math.pow(x,3) - 6.0); }
}
