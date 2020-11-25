package by.victor.lesson1.task9;

public class CircleParamFinder {
    public static double[] countLengthAndSquare (double R) {
        if (R < 0)
            throw new IllegalArgumentException("R should be positive");
        else
            return new double[] {2*Math.PI*R, Math.PI * R*R};
    }
}
