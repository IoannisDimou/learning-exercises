package gr.aueb.cf.structuredProgramming.ch4;

/**
 * Prints a pyramid of stars (*) with 4 lines.
 * The pyramid starts with 1 star in the first line, 3 in the second, and so on,
 * with each line having an odd number of stars. The number of spaces before the stars
 * decreases by 1 for each subsequent line.
 */
public class PyramidOfStars {

    public static void main(String[] args) {
        // Outer loop controls the number of lines (rows) in the pyramid
        for (int row = 1; row <= 8; row += 2) {
            // Inner loop to print the leading spaces for each line
            for (int spaces = 1; spaces <= (8 - row) / 2; spaces++) {
                System.out.print(" ");
            }
            // Inner loop to print the stars for each line
            for (int stars = 1; stars <= row; stars++) {
                System.out.print('*');
            }

            System.out.println(); // Move to the next line after printing spaces and stars

        }
    }
}
