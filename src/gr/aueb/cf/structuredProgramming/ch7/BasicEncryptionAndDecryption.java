package gr.aueb.cf.structuredProgramming.ch7;

import java.util.Scanner;

/**
 * Provides basic encryption and decryption functionality by shifting characters.
 * Encryption replaces each character with the next one in the Unicode table,
 * while decryption replaces each character with the previous one.
 */
public class BasicEncryptionAndDecryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText;

        System.out.print("Please enter your text: ");
        inputText = scanner.nextLine().strip();

        System.out.println();

        System.out.println("Original Text: " + inputText);

        String encryptedText = encrypt(inputText);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    /**
     * Encrypts the input text by shifting each character to the next one in the Unicode table.
     *
     * @param inputText the text to be encrypted
     * @return the encrypted text
     */
    public static String encrypt(String inputText) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            encrypted.append((char)(inputText.charAt(i) + 1));
        }

        return encrypted.toString();
    }

    /**
     * Decrypts the input text by shifting each character to the previous one in the Unicode table.
     *
     * @param encryptedText the text to be decrypted
     * @return the decrypted text
     */
    public static String decrypt(String encryptedText) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < encryptedText.length(); i++) {
            decrypted.append((char)(encryptedText.charAt(i) - 1));
        }

        return decrypted.toString();
    }
}
