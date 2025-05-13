package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The user enters an integer number and the program prints the day of the week equivalent to that number
 *
 * Example:
 * 1 -> Monday
 * 2 -> Tuesday
 * 3...
 * 4...
 * 7 -> Sunday
 */
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;

        System.out.print("Please enter a number from 1 to 7: ");
        userInput = scanner.nextInt();

        switch(userInput){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.print("Invalid input.");
        }
    }
}
