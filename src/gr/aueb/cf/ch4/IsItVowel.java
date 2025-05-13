package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The program prompts the user for a greek letter and checks if it's a vowel. If it is, it returns True else
 * it returns False
 */
public class IsItVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char greekLetter;

        System.out.println("Please enter a greek letter: ");
        greekLetter =  Character.toUpperCase(scanner.nextLine().charAt(0));

        switch (greekLetter) {
            case 'Α','Ε','Η','Ι','Ο','Υ','Ω' -> System.out.println("True");
            case 'Β','Γ','Δ','Ζ','Θ','Κ','Λ','Μ','Ν','Ξ','Π','Ρ','Σ','Τ','Φ','Χ','Ψ' -> System.out.println("False");
            default -> System.out.println("Invalid letter");
        }
    }
}
