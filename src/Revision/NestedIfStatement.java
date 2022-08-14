package Revision;

public class NestedIfStatement {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = 30;

        if (a > c) {
            System.out.println("C is greater than A this should not happen");
        }
        else if (b>a)
        {
            System.out.println("B is greater than A");
        }
        else
        {
            System.out.println("This program doesn't make sense");
        }
    }
}
