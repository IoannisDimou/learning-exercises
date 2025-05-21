package gr.aueb.cf.structuredProgramming.ch6;

public class SecondLowestValue {
    public static void main(String[] args) {

        int[] test = {5,5,5};
        int result = getSecondLowestValue(test, 0, test.length-1);
        System.out.println("Second lowest: " + result);


    }

    /**
     * Returns the second-lowest value in the specified array range.
     *
     * @param arr  the array to search
     * @param low  the starting position (inclusive)
     * @param high the ending position (inclusive)
     * @return returns the value of the second-lowest, or -1 if the input values are incorrect
     */
    public static int getSecondLowestValue(int[] arr, int low, int high) {
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        if (low < 0 || low > high || high >= arr.length ) {
            System.out.println("Incorrect values");
            return -1;

        }
        for (int num : arr) {
            if (num < lowest) {
                secondLowest = lowest;
                lowest = num;
            } else if (num > lowest && num < secondLowest) {
                secondLowest = num;
            }
        }
        return (secondLowest == Integer.MAX_VALUE) ? -1 : secondLowest;
    }
}
