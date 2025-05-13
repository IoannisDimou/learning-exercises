package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * The user enters a temperature on Celsius and the program prints the temperature on Fahrenheit
 */
public class Temperatures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userTemp;

        System.out.print("Please type a temperature in Celsius: ");
        userTemp = scanner.nextDouble();

        double result = celsiusToFahrenheit(userTemp);
        System.out.printf("The temperature %.1f in celsius is %.1f in fahrenheit ",userTemp, result);
    }
    /**
     * Converts a temperature from Celsius to Fahrenheit.
     * @param celsiusTemp The temperature in Celsius.
     * @return The temperature converted to Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsiusTemp){
        double fahrenheitTemp = celsiusTemp * 9/5 + 32;
        return fahrenheitTemp;
    }
}

