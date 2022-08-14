package ControlStatements;

public class IfElseCondition {

    public static void main(String args[]){
        int age = 15;

        // want to verify if the person is eligible for vote
        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not eligible");
        }

        // identify the number is even or odd.
        int n = 5;

        if(n%2 == 0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }

        // Largest of two numbers
        int a = 10;
        int b = 20;

        if(a>b)
        {
            System.out.println("a is largest number");
        }
        else
        {
            System.out.println("b is largest number");
        }

    }
}
