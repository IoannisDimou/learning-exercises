package gr.aueb.cf.ch4;

/**
 * Prints all even numbers from 1 to 20
 */
public class EvenNumbers {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++ ) {
            if ((i & 1) == 0) System.out.print(i + " ");
        }
    }
}