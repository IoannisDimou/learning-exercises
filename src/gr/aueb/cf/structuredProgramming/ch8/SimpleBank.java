package gr.aueb.cf.structuredProgramming.ch8;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A simple banking application that allows deposits and withdrawals.
 */
public class SimpleBank {
    private static double balance = 500;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Current balance: " + balance);
            System.out.println("Choose an action: 1 -> Deposit | 2 -> Withdraw | 3 -> Exit");
            int userAction = in.nextInt();

            switch (userAction) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.err.println(LocalDateTime.now() + " Error: Invalid input. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.err.println(LocalDateTime.now() + " Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " Error: " + e.getMessage());
        } finally {
            in.close();
        }
    }

    /**
     * Deposits a specified amount into the account.
     * @throws IllegalArgumentException If the amount is negative.
     * @throws Exception If input is invalid.
     */
    public static void deposit() throws Exception {
        System.out.print("Enter the amount to deposit: ");
        double amount = in.nextDouble();

        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }

        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    /**
     * Withdraws a specified amount from the account.
     * @throws IllegalArgumentException If the amount is negative or exceeds balance.
     * @throws Exception If input is invalid.
     */
    public static void withdraw() throws Exception {
        System.out.print("Enter the amount to withdraw: ");
        double amount = in.nextDouble();

        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

