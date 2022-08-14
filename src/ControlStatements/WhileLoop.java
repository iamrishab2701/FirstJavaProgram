package ControlStatements;

public class WhileLoop {

    public static void main(String args[])
    {


        int i=1;

        // Print number upto 10
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }

        //Print only Even number between 1 and 10
        i=2;
        while(i<=10)
        {
            System.out.println(i);
            i+=2;
        }

        //Print in descending order
        i=10;
        while(i>=1)
        {
            System.out.println(i);
            i--;
        }
    }
}