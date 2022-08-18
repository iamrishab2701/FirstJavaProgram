package Practice;

import java.util.Scanner;

class checkvowel{
    boolean containvowel(String input)
        {
           return input.toLowerCase().matches(".*[aeiou]*.");
        }
}

public class StringContainVowel {

    public static void main(String[] args) {
        checkvowel cv = new checkvowel();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String in = input.nextLine().toString();

        System.out.println(cv.containvowel(in));

    }
}
