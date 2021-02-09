package by.victor.lesson1.task5;

public class PerfectNumbers {
    public static boolean checkIfPerfect (long number){
        if (number <= 0) {
            throw new IllegalArgumentException("Number should be natural!");
        }
        return number == getSumOfDividers(number);
    }

    private static long getSumOfDividers (long number){
        long sum = 0;
        for (long i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
