package gr.aueb.cf.oopProgramming.ch2;

public class MathHelper {


    private MathHelper() {

    }

    public static void min (int[] array) {
        int arrayMin = Integer.MAX_VALUE;

        for (Integer number : array) {
            arrayMin = Math.min(arrayMin, number);
        }

        System.out.println("The min number of the array is: " + arrayMin);
    }

    public static void max (int[] array) {
            int arrayMax = Integer.MIN_VALUE;

        for (Integer number : array) {
            arrayMax = Math.max(arrayMax, number);
        }

        System.out.println("The max number of the array is: " + arrayMax);
    }

    public static void avg (int[] array) {
        int count = 0;
        int sum = 0;
        int  average;

        for (Integer number : array) {
            count++;
            sum += number;
        }

        average = sum / count;

        System.out.println("The average of the array is: " + average);
    }


}
