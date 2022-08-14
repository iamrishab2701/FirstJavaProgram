package ArrayAndStrings;

public class AssignmentStrings {

    public static void main(String[] args) {

        String a = "JAVA";
        String b = "java";
        String c = "python";

        //Write a java program to compare two strings, ignoring case differences
        if(a.equalsIgnoreCase(b))
        {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //Write a Java Program to get the length of the given string

        System.out.println(a.length());

        //Write a java program to get a substring of given string between two specific position

        System.out.println(a.substring(0,3));

        //write a java program to convert all the characters in a string to uppercase

        System.out.println(b.toUpperCase());

        //write a java program to convert all the character in a string to lowercase

        System.out.println(a.toLowerCase());

    }
}
