package gr.aueb.cf.structuredProgramming.ch7;

import java.util.Scanner;

/**
 * A Java implementation of the Caesar Cipher encryption and decryption algorithm.
 * This class provides methods to encrypt and decrypt text using a fixed shift key of 3.
 */
public class CaesarCipher {

    private static final int SHIFT_KEY = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText;

        System.out.print("Please enter your text: ");
        inputText = scanner.nextLine().strip();

        System.out.println("\nOriginal Text: " + inputText);

        String encryptedText = encrypt(inputText);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);

        scanner.close();
    }

    /**
     * Encrypts the given plaintext using the Caesar cipher with a fixed shift key.
     *
     * @param plainText The text to be encrypted.
     * @return The encrypted text.
     */
    public static String encrypt(String plainText) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);

            if (Character.isUpperCase(c)) {
                encrypted.append((char) ((c - 'A' + SHIFT_KEY) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                encrypted.append((char) ((c - 'a' + SHIFT_KEY) % 26 + 'a'));
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    /**
     * Decrypts the given ciphertext using the Caesar cipher with a fixed shift key.
     *
     * @param cipherText The text to be decrypted.
     * @return The decrypted text.
     */
    public static String decrypt(String cipherText) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char c = cipherText.charAt(i);

            if (Character.isUpperCase(c)) {
                decrypted.append((char) ((c - 'A' - SHIFT_KEY + 26) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                decrypted.append((char) ((c - 'a' - SHIFT_KEY + 26) % 26 + 'a'));
            } else {
                decrypted.append(c);
            }
        }

        return decrypted.toString();
    }
}

