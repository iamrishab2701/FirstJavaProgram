package Practice;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Number1;
        int Number2;
        System.out.println("Enter the first number");
        Number1 = input.nextInt();
        System.out.println("Enter the Second number");
        Number2 = input.nextInt();

        if(Number1 == Number2)
        {
            System.out.println("Both the numbers are same");
        }
        else if(Number1 != Number2)
        {
            System.out.println("Both the numbers are not same");
        }
        
    }
    
}
