package Basics;

public class Operators {

    public static void main(String[] args){

        int a = 10;
        int b = 20;

        // Arithmetic operators --> + - * / %

        System.out.println("sum of a and b is :" + (a+b));
        System.out.println("sub of a and b is :" + (b-a));
        System.out.println("mul of a and b is :" + (a*b));
        System.out.println("Div of a and b is :" + (a/b));
        System.out.println("Rem of a and b is :" +(a%b));

        // Relational Operators (Comparison operators) --> == <> <= >= !=
        // Always return boolean value

        System.out.println(a == b);  //false
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);

        // Logical operators && || !
        // works between two boolean values

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x); //false
        System.out.println(!y); //true

        //Increment and Decrement Operators ++ --

        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        //Assignment Operator ==

    }
}
