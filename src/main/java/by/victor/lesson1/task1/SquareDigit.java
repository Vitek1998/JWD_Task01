package by.victor.lesson1.task1;

public class SquareDigit {
    public static Integer getLastDigitOfSquare(Integer number){
        if (number == null) {
            throw new IllegalArgumentException("Argument can't be null");
        }
        return ((number % 10) * (number % 10)) % 10;
    }
}
