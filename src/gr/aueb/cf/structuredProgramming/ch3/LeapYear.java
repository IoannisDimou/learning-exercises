package gr.aueb.cf.structuredProgramming.ch3;

import java.util.Scanner;

/**
 *   Διαβάζει το έτος που δίνει ο χρήστης και εμφανίζει στην οθόνη αν το έτος αυτό είναι δίσεκτο ή όχι.
 *
 *   Ένα έτος θεωρείται δίσεκτο αν πληροί τις ακόλουθες προϋποθέσεις:
 *      -Πρέπει να διαιρείται με το 4.
 *      -Αν διαιρείται με το 100, πρέπει επίσης να διαιρείται με το 400 για να είναι δίσεκτο.
 *
 *   Παραδείγματα:
 *      -Το 2000 είναι δίσεκτο (διαιρείται με το 400).
 *      -Το 1900 δεν είναι δίσεκτο (διαιρείται με το 100 αλλά όχι με το 400).
 *      -Το 2024 είναι δίσεκτο (διαιρείται με το 4 αλλά όχι με το 100).
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear;
        System.out.println("Please enter a year");
        inputYear = scanner.nextInt();

        if(inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0)){
            System.out.printf("The year %d is: Leap Year", inputYear);
        }else{
            System.out.printf("The year %d is: Not Leap Year", inputYear);
        }
    }
}
