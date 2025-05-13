package gr.aueb.cf.ch4;

/**
 * Prints the sum of integers from 1 to 50
 */
public class IntegerSum {

    public static void main(String[] args) {
        int number = 50;
        int sumOfIntegers = number * (number + 1) / 2;

        System.out.printf("The result is: %d", sumOfIntegers);

    }
}
