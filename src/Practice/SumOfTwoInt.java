package Practice;

import java.util.Scanner;


public class SumOfTwoInt {

    static boolean sumoftwo(int x, int y, int z)
    {
        if(x+y == z || y+z == x || z+x == y )
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int a = input.nextInt();
        System.out.println("Enter the value of B : ");
        int b = input.nextInt();
        System.out.println("Enter the value of C : ");
        int c = input.nextInt();
        System.out.println("The result is + " + sumoftwo(a,b,c));


    }
}
