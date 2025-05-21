package gr.aueb.cf.structuredProgramming.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού με τις παρακάτω επιλογές:
 *  - Εισαγωγή
 *  - Διαγραφή
 *  - Ενημέρωση
 *  - Αναζήτηση
 *  - Έξοδος
 *
 *  Για παράδειγμα, αν ο χρήστης δώσει 1, θα εμφανίζεται το μήνυμα "Επιλέξατε Εισαγωγή"
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("Please choose: 1 -> insert, 2 -> delete, 3 -> update, 4 -> search, 5 -> exit");
            action = scanner.nextInt();

            if(action < 1 || action > 5){
                System.out.println("Please enter a value between 1 and 5");
                continue;
            }

            if(action == 5) {
                System.out.println("exiting...");
                System.out.println("Bye!");
                isRunning = false;
            }else if(action == 1){
                System.out.println("choose what to add");
            }else if(action == 2){
                System.out.println("choose what to delete");
            }else if(action == 3){
                System.out.println("choose what to update");
            }else{
                System.out.println("choose what to search");
            }
        }
    }
}

