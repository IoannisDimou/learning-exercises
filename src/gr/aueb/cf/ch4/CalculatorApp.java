package gr.aueb.cf.ch4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * A simple calculator application that performs basic arithmetic operations on two integers.
 * The user is prompted to input two integers and an operator (+, -, *, /). The program then
 * calculates and displays the result of the operation.
 */
public class CalculatorApp {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int userNumber1;
        int userNumber2;
        char operator = ' ';

        System.out.println("Please enter first integer:");
        userNumber1 = scanner.nextInt();
        System.out.println("Please enter second integer:");
        userNumber2 = scanner.nextInt();
        scanner.nextLine(); // consuming left over buffer
        System.out.println("Please enter one of those characters: '+', '-', '*', '/' ");
        operator = scanner.nextLine().charAt(0);

        switch (operator) {
            case '+' -> System.out.printf("The result of %d + %d = %d\n",userNumber1, userNumber2,  userNumber1 + userNumber2);
            case '-' -> System.out.printf("The result of %d - %d = %d\n",userNumber1, userNumber2,  userNumber1 - userNumber2);
            case '*' -> System.out.printf("The result of %d * %d = %d\n",userNumber1, userNumber2,  userNumber1 * userNumber2);
            case '/' -> System.out.printf("The result of %d / %d = %d\n",userNumber1, userNumber2, userNumber2 == 0 ? 0 : userNumber1 / userNumber2); //returns 0 if division by 0 is occurred
            default -> System.out.println("Invalid symbol");
        }

    }
}
