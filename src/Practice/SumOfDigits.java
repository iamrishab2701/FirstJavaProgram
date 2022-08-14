package Practice;

import java.util.Scanner;


public class SumOfDigits {

 public static void main(String[] args) {
    
    int x;
    int sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    x = input.nextInt();

    while(x != 0)
    {
        sum = sum + x%10;
        x = x/10;
    }

    System.out.println("Sum of digits of entered number is : "+ sum);
 }
    
}