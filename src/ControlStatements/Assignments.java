package ControlStatements;

public class Assignments {

    public static void main(String args[])
    {
        //find a java program to find a number is positive or negative

        int num = -1;
        if(num>0)
        {
            System.out.println("Number is Positive");
        }
        else
        {
            System.out.println("Number is negative");
        }

        //Write a Java Program to find greatest of 3 numbers

        int a = 7;
        int b = 5;
        int c = 3;

        if(a > b && a > c)
        {
            System.out.println("Value of a is greater");
        } else if (b > a && b > c)
        {
            System.out.println("Value of b is greater");
        }
        else
        {
            System.out.println("Value of c is greater");
        }

        // Write a program in Java to Display the multiplication table of 5

        int numb = 5;
        int res = 0;

        for(int i=0;i<=10;i++) {
            res = numb*i;
            System.out.println(numb + "x" + i + "=" + res );
        }

        // Write a Java program to count the number of the digit of the number.

        int number = 1234567;
        int count = 0;

        while(number != 0)
        {
            number = number/10;
            count++;
        }
        System.out.println("Digit = " + count);

    }
}