package Practice;

import java.util.Scanner;

public class SecondGreaterThanThird {




    static boolean numbers(int x, int y, int z)
    {
        if(y>x && z>y)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the Second number: ");
        int b = input.nextInt();
        System.out.println("Enter the third number: ");
        int c = input.nextInt();
        System.out.println(numbers(a,b,c));

    }
}
