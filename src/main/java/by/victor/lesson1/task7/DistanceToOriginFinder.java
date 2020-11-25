package by.victor.lesson1.task7;

public class DistanceToOriginFinder {
    public static double[] getClosest(double[] dot1, double[] dot2){
        if((dot1.length != 2 || dot2.length != 2))
            throw new IllegalArgumentException("Arrays should have 2 elements");
        double length1 = getLengthToOrigin(dot1[0],dot1[1]);
        double length2 = getLengthToOrigin(dot2[0],dot2[1]);
        if (length1 == length2)
            return new double[] {dot1[0],dot1[1],dot2[0],dot2[1]};
        else
            return length1 < length2 ? dot1 : dot2;
    }

    private static double getLengthToOrigin (double x, double y){
        return Math.sqrt((x * x) + (y * y));
    }
}
