package by.victor.lesson1.task3;

public class AreaOfSquare {

    //a - side of larger square, b - side of smaller, d - diameter of circle
    //s_large = a^2, a = sqrt(s_large), d = a = b(sqrt(2)),
    //b = sqrt(s_large/2),  s_small = b^2 = s_large/2
    public static Double getArea (Double areaOfLargerSquare){
        if(areaOfLargerSquare == null || areaOfLargerSquare < 0.0)
            throw new IllegalArgumentException("Area should be positive");
        else
            return areaOfLargerSquare/2;
    }
}
