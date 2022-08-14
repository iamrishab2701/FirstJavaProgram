package Practice;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        a = input.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}
