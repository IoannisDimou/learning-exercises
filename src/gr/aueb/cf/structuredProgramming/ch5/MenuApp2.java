package gr.aueb.cf.structuredProgramming.ch5;

import java.util.Scanner;

/**
 * This class prints various star patterns based on user input.
 * The patterns include horizontal, vertical, n x n grid, ascending, and descending star sequences.
 */
public class MenuApp2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    public static int numberOfStars() {
        System.out.print("Please select number of  stars: ");
        return scanner.nextInt();
    }

    public static void menu() {
        int choice;
        int numberOfStars = 0;

        while (true) {
            System.out.println("Please choose from one of the below options:");
            System.out.println("1 -> Horizontal, 2 -> Vertical, 3 -> NxN, 4-> Ascending, 5 -> Descending, 6 -> exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    numberOfStars = numberOfStars();
                    printHorizontalStars(numberOfStars);
                }
                case 2 -> {
                    numberOfStars = numberOfStars();
                    printVerticalStars(numberOfStars);
                }
                case 3 -> {
                    numberOfStars = numberOfStars();
                    printNxNStars(numberOfStars);
                }
                case 4 -> {
                    numberOfStars = numberOfStars();
                    printAscendingStars(numberOfStars);
                }
                case 5 -> {
                    numberOfStars = numberOfStars();
                    printDescendingStars(numberOfStars);
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again");
            }

        }

    }

    /**
     * Prints stars horizontally.
     *
     * @param numberOfStars The number of stars to print.
     */
    public static void printHorizontalStars(int numberOfStars) {
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    /**
     * Prints stars vertically.
     *
     * @param numberOfStars The number of stars to print.
     */
    public static void printVerticalStars(int numberOfStars) {
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.println('*');
        }
    }

    /**
     * Prints an n x n grid of stars.
     * Each row contains 'n' stars, and there are 'n' rows in total.
     * Reuses the {@link #printHorizontalStars(int)} method for each row.
     *
     * @param numberOfStars The size of the grid (both rows and columns).
     */
    public static void printNxNStars(int numberOfStars) {
        for (int column = 1; column <= numberOfStars; column++) {
            printHorizontalStars(numberOfStars);

        }
    }

    /**
     * Prints stars in ascending order (1 to n stars per row).
     *
     * @param numberOfStars The maximum number of stars in a row.
     */
    public static void printAscendingStars(int numberOfStars) {
        for (int row = 1; row <= numberOfStars; row++) {
            printHorizontalStars(row);
        }
    }

    /**
     * Prints stars in descending order (n to 1 stars per row).
     *
     * @param numberOfStars The starting number of stars in the first row.
     */
    public static void printDescendingStars(int numberOfStars) {
        for (int row = numberOfStars; row >= 1; row--) {
            printHorizontalStars(row);
        }
    }
}
