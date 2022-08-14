package Revision;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

        //Sum of first 10 natural numbers
        int sum = 0;
        for (int i = 0; i <= 10; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);

        //Ask user a number then print table for entered number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number please");
        int a = input.nextInt();
        int res = 0;
        for(int i=1;i<=10;i++)
        {
            res = a*i;
            System.out.println(a + "*" + i + "=" + res );
        }
    }
}
