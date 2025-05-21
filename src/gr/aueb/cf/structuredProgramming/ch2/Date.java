package gr.aueb.cf.structuredProgramming.ch2;

import java.util.Scanner;

/**
 * διαβάζει από τον χρήστη 3 ακέραιους αριθμούς που αναπαριστούν ημέρα, μήνα, έτος και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
 */
public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.print("Please enter day, month and year (e.g. 25 12 1993): ");

        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        // Αποκοπή τελευταίων 2 ψηφίων του έτους
        year %= 100;

        System.out.printf("%02d/%02d/%02d", day, month, year);
    }
}
