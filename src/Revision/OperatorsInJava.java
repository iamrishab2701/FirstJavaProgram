package Revision;

import Basics.Assigment;

import java.sql.SQLOutput;

public class OperatorsInJava {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        boolean c = true;
        boolean d = false;

        //Arithmetic Operator +,-,*,/,%

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(b/a);
        System.out.println(a*b);
        System.out.println(b%a);

        //Relational Operators or Comparision operators <,>,<=,>=

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        //Logical Operators &&'AND' ||'OR'

        System.out.println(c&d); //False
        System.out.println(c&c); //True
        System.out.println(d&c); //False
        System.out.println(d&d); //False
        System.out.println(c||d); //True
        System.out.println(c||c); //True
        System.out.println(d||c); //True
        System.out.println(d||d); //False

        //Increment and Decrement

        System.out.println(++a); //+1
        System.out.println(--b); //-1


    }


}
