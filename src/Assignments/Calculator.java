package Assignments;
import java.util.Scanner;

public class Calculator {
    int a;
    int b;
    char c;

    int add()
    {

        return a+b;
    }

    int mult()
    {
        return a*b;
    }

    int sub()
    {
        return a-b;
    }

    int div()
    {
        return a/b;
    }

    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        obj1.a = input.nextInt();
        System.out.println("Enter Second number");
        obj1.b = input.nextInt();
        System.out.println("Select the operation you want to perform (Enter *,+,-,/)");
        obj1.c = input.next().charAt(0);

        if(obj1.c == '+')
        {
            System.out.println(obj1.add());
        }
        else if (obj1.c == '-')
        {
            System.out.println(obj1.sub());
        } else if (obj1.c == '*')
        {
            System.out.println(obj1.mult());
        } else if (obj1.c == '/')
        {
            System.out.println(obj1.div());
        }
        else{
            System.out.println("Please enter the correct operation");
        }


    }
}