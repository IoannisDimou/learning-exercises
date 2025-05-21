package gr.aueb.cf.structuredProgramming.ch2;

import java.util.Scanner;

/**
 * μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ (Fahrenheit) στην κλίμακα Κελσίου
 */
public class Temperature {
    public static void main(String[] args) {
        double inputTemperature;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a temperature in Fahrenheit");
        inputTemperature = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using formula: (5/9) * (F - 32)
        final double TEMPERATURE_CELSIUS = (5.0/9) * (inputTemperature - 32);

        System.out.printf("The temperature in celsius is: %f", TEMPERATURE_CELSIUS);

    }
}
