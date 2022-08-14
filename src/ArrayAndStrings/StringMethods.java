package ArrayAndStrings;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String s="Welcome";
        String s1="to Java";
        String s2=" Hello ";
        System.out.println(s.length()); //Length of a string
        System.out.println(s.concat(s1)); //Concatenating of the strings
        System.out.println(s2);
        System.out.println(s2.trim()); //Remove the spaces from left and right side
        System.out.println(s.charAt(3)); //gives the character at specific index number
        System.out.println(s.contains("com")); //checks for the given character are available in the string or not(Case sensitive)
        System.out.println(s.equals("Welcome")); //compare the two given strings
        System.out.println(s.equalsIgnoreCase(s2)); // same as equals() but it is case-insensitive
        System.out.println(s1.replace("Java", "Selenium")); //replaces char or string.
        System.out.println(s.substring(1,3)); //return string based on starting index and ending index || extracting substring from the main string using substring method
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(2,4));
        System.out.println(s.substring(4,7));
        System.out.println(s.toLowerCase()); //convert into lower case
        System.out.println(s.toUpperCase()); //convert into uppar case

    }
}
