package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * This class prints various star patterns based on user input.
 * The patterns include horizontal, vertical, n x n grid, ascending, and descending star sequences.
 */
public class Stars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int numberOfStars = scanner.nextInt();

        printHorizontalStars(numberOfStars);
        printVerticalStars(numberOfStars);
        printNxNStars(numberOfStars);
        printAscendingStars(numberOfStars);
        printDescendingStars(numberOfStars);
    }

    /**
     * Prints stars horizontally.
     * @param numberOfStars The number of stars to print.
     */
    public static void printHorizontalStars(int numberOfStars) {
        System.out.print("Horizontal: ");
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    /**
     * Prints stars vertically.
     * @param numberOfStars The number of stars to print.
     */
    public static void printVerticalStars(int numberOfStars) {
        System.out.println("Vertical: ");
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.println('*');
        }
    }

    /**
     * Prints an n x n grid of stars.
     * @param numberOfStars The size of the grid (n rows and n columns).
     */
    public static void printNxNStars(int numberOfStars) {
        System.out.println("n x n: ");
        for (int row = 1; row <= numberOfStars; row++) {
            for (int column = 1; column <= numberOfStars; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /**
     * Prints stars in ascending order (1 to n stars per row).
     * @param numberOfStars The maximum number of stars in a row.
     */
    public static void printAscendingStars(int numberOfStars) {
        System.out.println("1 to n: ");
        for (int row = 1; row <= numberOfStars; row++) {
            for (int starsInRow = 1; starsInRow <= row; starsInRow++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /**
     * Prints stars in descending order (n to 1 stars per row).
     * @param numberOfStars The starting number of stars in the first row.
     */
    public static void printDescendingStars(int numberOfStars) {
        System.out.println("n to 1: ");
        for (int row = 1; row <= numberOfStars; row++) {
            for (int starsInRow = numberOfStars; starsInRow >= row; starsInRow--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}




















