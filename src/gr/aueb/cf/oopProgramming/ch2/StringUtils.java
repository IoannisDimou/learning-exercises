package gr.aueb.cf.oopProgramming.ch2;

public class StringUtils {

    private StringUtils() {

    }

    public static void reverseString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        System.out.println("The string reversed is: " + sb.toString());
    }

    public static void stringToUpper(String s) {
        String upper = s.toUpperCase();

        System.out.println("The string to upper is: " + upper);
    }

    public static boolean isPalin(String s) {
        boolean palin = true;
        int end = s.length() -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != (s.charAt(end))) {
                palin = false;
                break;
            }
            end--;
        }

        return palin;
    }
}
