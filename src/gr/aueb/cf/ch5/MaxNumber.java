package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * The main method of the program. It prompts the user to enter three integers,
 * reads them from the standard input, finds the maximum among them using the
 * {@link #findMax(int, int, int)} method, and prints the result.
 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput1;
        int userInput2;
        int userInput3;

        System.out.print("Please enter 3 integer numbers: ");
        userInput1 = scanner.nextInt();
        userInput2 = scanner.nextInt();
        userInput3 = scanner.nextInt();

        int biggest = findMax(userInput1, userInput2, userInput3);

        System.out.printf("The biggest number between %d, %d and %d is %d", userInput1, userInput2, userInput3, biggest);
    }

    /**
     *
     * @param number1 first number that user entered
     * @param number2 second number that user entered
     * @param number3 third number that user entered
     * @return returns the biggest number of the three
     */
    public static int findMax(int number1, int number2, int number3){
        if (number1 > number2 && number1 > number3){
            return number1;
        }else if (number2 > number3){
            return number2;
        }else {
            return number3;
        }
        // alternative solution:
            // return Math.max(Math.max(number1, number2), number3);
    }
}
