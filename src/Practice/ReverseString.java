package Practice;
import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        char[] letters = input.nextLine().toCharArray();
        System.out.println("Reverse String");
        for( int i=letters.length - 1;i>=0;i--)
        {
            System.out.println(letters[i]);
        }
        System.out.println("\n");
    }
}
