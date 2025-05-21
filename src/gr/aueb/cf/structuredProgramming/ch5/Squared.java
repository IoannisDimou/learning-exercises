package gr.aueb.cf.structuredProgramming.ch5;

import java.util.Scanner;

/**
 * A simple utility class that calculates the square of an integer.
 * Demonstrates basic method usage and user input handling in Java.
 */
public class Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.print("Please type an integer number: ");
        userInput = scanner.nextInt();

        int userInputSquared = square(userInput);
        System.out.printf("The number %d squared is %d",userInput, userInputSquared);


    }

    /**
     *
     * @param number the number that the user types in
     * @return returns the number squared
     */
    public static int square(int number){
        int squared = number * number;
        return squared;
    }
}
