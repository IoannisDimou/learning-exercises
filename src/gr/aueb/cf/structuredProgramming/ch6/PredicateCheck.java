package gr.aueb.cf.structuredProgramming.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class PredicateCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[6];

        System.out.println("Please enter 6 integers from 1 to 49:");
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("Results:");
        System.out.println("1. The array has at most 3 even numbers: " + hasAtMostThreeEvenNumbers(userNumbers));
        System.out.println("2. The array has at most 3 odd numbers: " + hasAtMostThreeOddNumbers(userNumbers));
        System.out.println("3. The array has at most 3 consecutive numbers: " + hasAtMostThreeConsecutiveNumbers(userNumbers));
        System.out.println("4. The array has at most 3 numbers with same last digit: " + hasAtMostThreeSameLastDigits(userNumbers));
        System.out.println("5. The array has at most 3 numbers in same decade: " + hasAtMostThreeInSameDecade(userNumbers));
    }

    /**
     * Checks if the array contains at most 3 even numbers.
     * @param numbers the array of numbers to check
     * @return true if there are 3 or fewer even numbers, false otherwise
     */
    public static boolean hasAtMostThreeEvenNumbers(int[] numbers) {
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
                if (evenCount > 3) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the array contains at most 3 odd numbers.
     * @param numbers the array of numbers to check
     * @return true if there are 3 or fewer odd numbers, false otherwise
     */
    public static boolean hasAtMostThreeOddNumbers(int[] numbers) {
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
                if (oddCount > 3) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the array contains at most 3 consecutive numbers.
     * @param numbers the array of numbers to check
     * @return true if the maximum sequence of consecutive numbers is 3 or less, false otherwise
     */
    public static boolean hasAtMostThreeConsecutiveNumbers(int[] numbers) {
        Arrays.sort(numbers);
        int maxConsecutive = 1;
        int currentConsecutive = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1] + 1) {
                currentConsecutive++;
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
            } else if (numbers[i] != numbers[i - 1]) {
                currentConsecutive = 1;
            }
        }

        return maxConsecutive <= 3;
    }

    /**
     * Checks if the array contains at most 3 numbers with the same last digit.
     * @param numbers the array of numbers to check
     * @return true if no digit appears more than 3 times as last digit, false otherwise
     */
    public static boolean hasAtMostThreeSameLastDigits(int[] numbers) {
        int[] lastDigitCounts = new int[10]; // Digits 0-9

        for (int num : numbers) {
            int lastDigit = num % 10;
            lastDigitCounts[lastDigit]++;
            if (lastDigitCounts[lastDigit] > 3) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the array contains at most 3 numbers in the same decade.
     * @param numbers the array of numbers to check
     * @return true if no decade contains more than 3 numbers, false otherwise
     */
    public static boolean hasAtMostThreeInSameDecade(int[] numbers) {
        int[] decadeCounts = new int[5]; // Decades: 0-9, 10-19, 20-29, 30-39, 40-49

        for (int num : numbers) {
            int decade = num / 10;
            decadeCounts[decade]++;
            if (decadeCounts[decade] > 3) {
                return false;
            }
        }
        return true;
    }
}