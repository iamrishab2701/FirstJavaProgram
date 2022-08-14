package Practice;

import java.util.Scanner;

public class CountNumberStringSpaces {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter long string with spaces, letters and number : ");
        char ch[] = in.nextLine().toCharArray();
        int letter = 0;
        int number = 0;
        int spaces = 0;
        int others = 0;

        for(int i = 0; i<ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("Letter : " + letter);
        System.out.println("Number : " + number);
        System.out.println("spaces : " + spaces);
        System.out.println("Other characters : " + others);

    }
}
