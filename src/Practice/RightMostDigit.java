package Practice;

import java.util.Scanner;

public class RightMostDigit {

    public boolean rightmost(int x, int y, int z)
    {
        if(x%10 == y%10 || y%10 == z%10 || z%10 == x%10 )
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = input.nextInt();
        System.out.println("Enter Second number: ");
        int b = input.nextInt();
        System.out.println("Enter Third number: ");
        int c = input.nextInt();
        RightMostDigit obj1 = new RightMostDigit();
        System.out.println(obj1.rightmost(a, b, c));

    }
}
