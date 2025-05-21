package gr.aueb.cf.structuredProgramming.ch6;

public class MethodForMaxPosition {
    public static void main(String[] args) {

    }

    /**
     * Returns the position of the maximum value in the specified array range.
     *
     * @param arr  the array to search
     * @param low  the starting position (inclusive)
     * @param high the ending position (inclusive)
     * @return the position of the maximum value, or -1 if the input values are incorrect
     */
    public static int getMaxPosition (int[] arr, int low, int high ) {

        int max = Integer.MIN_VALUE;
        int maxPosition = low;

        if (low < 0 || low > high || high >= arr.length ) {
            System.out.println("Incorrect values");
            return -1;
        }

        for (int i = low; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }

        }
        return maxPosition;
    }
}
