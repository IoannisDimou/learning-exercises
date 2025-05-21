package gr.aueb.cf.structuredProgramming.ch6;

import java.util.Arrays;

public class ArrayCalculations {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, -2, 6};

        System.out.println("Index of 5: " + searchValue(test, 5));
        System.out.println("Even numbers: " + Arrays.toString(filterEvenNumbers(test)));
        System.out.println("Multiplied array: " + Arrays.toString(arrayMultiplied(test)));
        System.out.println("Has positive number: " + hasPositiveNumber(test));
        System.out.println("All positives: " + areAllPositive(test));
    }

    /**
     * Searches for a specific value in the given array.
     *
     * @param array The array to be searched.
     * @param value The value to search for.
     * @return The index of the value if found, otherwise -1.
     */
    public static int searchValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Filters and returns an array containing only the even numbers.
     *
     * @param array The input array.
     * @return A new array with only the even numbers.
     */
    public static int[] filterEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) count++;
        }

        int[] evens = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
        }
        return evens;
    }

    /**
     * Multiplies each element of the array by 2.
     *
     * @param array The input array.
     * @return A new array with each element multiplied by 2.
     */
    public static int[] arrayMultiplied(int[] array) {
        int[] multipliedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            multipliedArray[i] = array[i] * 2;
        }
        return multipliedArray;
    }

    /**
     * Checks if the array contains at least one positive number.
     *
     * @param array The input array.
     * @return True if at least one positive number exists, otherwise false.
     */
    public static boolean hasPositiveNumber(int[] array) {
        for (int num : array) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if all elements in the array are positive numbers.
     *
     * @param array The input array.
     * @return True if all elements are positive, otherwise false.
     */
    public static boolean areAllPositive(int[] array) {
        for (int num : array) {
            if (num < 0) {
                return false;
            }
        }
        return true;
    }
}
