package Assignments;

public class Calculations {

    int a;
    int b;
    int c;
    Calculations()
    {
        a=10;
        b=20;
        c=30;
    }
    void sum()
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Calculations marks1 = new Calculations();
        marks1.sum();
    }
}
