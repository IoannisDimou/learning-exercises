package gr.aueb.cf.oopProgramming.ch2;

public class StringUtilsMain {

    public static void main(String[] args) {

        String s = "madam";

        StringUtils.reverseString(s);
        StringUtils.stringToUpper(s);
        System.out.println("The String provided is palindrome: " + StringUtils.isPalin(s));
    }
}
