package gr.aueb.cf.structuredProgramming.ch6;

import java.util.Arrays;

public class OrderedArray {

    public static void main(String[] args) {
        int[] array = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        System.out.println(Arrays.toString(getLowAndHighIndexOf(array, 8)));
    }

    /**
     * Finds the starting and ending position of a key in a sorted array.
     *
     * @param arr the input sorted array with possible duplicates
     * @param key the value to search for
     * @return an array containing the low and high index of the key, or {-1, -1} if the key is not found
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] resultIndices = {-1, -1};


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                resultIndices[0] = i;
                break;
            }
        }


        if (resultIndices[0] == -1) {
            return resultIndices;
        }


        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == key) {
                resultIndices[1] = j;
                break;
            }
        }

        return resultIndices;
    }
}
