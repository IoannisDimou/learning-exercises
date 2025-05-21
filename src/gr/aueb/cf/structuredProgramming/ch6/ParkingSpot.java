package gr.aueb.cf.structuredProgramming.ch6;

import java.util.Arrays;

/**
 * Υπολογίζει τον μέγιστο αριθμό αυτοκινήτων που είναι σταθμευμένα
 * το ίδιο χρονικό διάστημα.
 */
public class ParkingSpot {

    public static void main(String[] args) {
        int[][] parkingTimes = {
                {1012, 1136},
                {1317, 1417},
                {1015, 1020}
        };

        int[][] allEvents = generateEvents(parkingTimes);
        Arrays.sort(allEvents, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int maxParked = getMaxParkedCars(allEvents);
        System.out.println("Μέγιστος αριθμός σταθμευμένων αυτοκινήτων: " + maxParked);
    }

    /**
     * Δημιουργεί πίνακα γεγονότων (άφιξη/αναχώρηση).
     *
     * @param times Πίνακας με ώρες άφιξης και αναχώρησης
     * @return Πίνακας γεγονότων σε μορφή {ώρα, τύπος} όπου τύπος: 1 = άφιξη, 0 = αναχώρηση
     */
    public static int[][] generateEvents(int[][] times) {
        int[][] events = new int[times.length * 2][2];

        for (int i = 0; i < times.length; i++) {
            events[2 * i][0] = times[i][0];
            events[2 * i][1] = 1;

            events[2 * i + 1][0] = times[i][1];
            events[2 * i + 1][1] = 0;
        }

        return events;
    }

    /**
     * Υπολογίζει το μέγιστο πλήθος αυτοκινήτων που είναι σταθμευμένα ταυτόχρονα.
     *
     * @param events Πίνακας με χρονικά γεγονότα
     * @return Μέγιστος αριθμός σταθμευμένων αυτοκινήτων
     */
    public static int getMaxParkedCars(int[][] events) {
        int currentCount = 0;
        int maxCount = 0;

        for (int[] event : events) {
            if (event[1] == 1) currentCount++;
            else currentCount--;
            if (currentCount > maxCount) maxCount = currentCount;
        }

        return maxCount;
    }
}

