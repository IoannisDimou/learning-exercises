package gr.aueb.cf.ch4;

/**
 * Prints from 1 to 10 in reverse
 * Example: 10 9 8 ... 3 2 1
 */
public class NumbersReversed {

    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // move to next line
    }
}