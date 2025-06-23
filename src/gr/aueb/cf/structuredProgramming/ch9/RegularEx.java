package gr.aueb.cf.structuredProgramming.ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
• Επαληθεύστε ότι έχει τη μορφή:
– Τουλάχιστον 8 χαρακτήρες
– Τουλάχιστον 1 μικρό γράμμα
– Τουλάχιστον 1 κεφαλαίο γράμμα
– Τουλάχιστον 1 αριθμό
– Τουλάχιστον 1 ειδικό χαρακτήρα #?!@$%^&*-
 */
public class RegularEx {

    public static void main(String[] args) {

        System.out.println(passwordChecker(password()));
    }

    public static String password() {
        return "3Ab.?adg";
    }

    public static boolean passwordChecker(String s) {

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$\n");

        Matcher matcher = pattern.matcher(s);

        return matcher.matches();
    }
}
