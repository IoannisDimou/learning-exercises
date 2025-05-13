package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * A utility class for checking if a number is prime.
 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.print("Please enter an integer: ");
        userInput = scanner.nextInt();
        boolean isItPrime;

        isItPrime = isPrime(userInput);
        System.out.println(isItPrime);
    }

    /**
     *
     * @param number number that the user enters
     * @return returns true if the number is prime, else returns false
     */
    public static boolean isPrime(int number){

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
