package OOPs;

public class StaticExample {

    static int a=10; //Static variable
    int b = 20; //Non - Static variable

    static void m1() //Static method
    {
        StaticExample se = new StaticExample();
        System.out.println(se.b);
        System.out.println("This is static method");
    }

    void m2() //Non-static method
    {
        System.out.println("This is non static method");
    }

    void m3()
    {
        System.out.println("This is m3 method ---------- non static");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args)
    {
        //Static methods can access only static stuff directly without creating any object
        System.out.println(a);
        m1();
        StaticExample.m1(); //Static method can be access with class name without creating new object

       //System.out.println(b); //incorrect because b variable is not static and without creating an object cannot not access it.
        //m2(); //incorrect because m2() method is not a static method and cannot be access without creating an object.

        //Static methods can access non-static but through object
        StaticExample se = new StaticExample();
        System.out.println(se.b); //non-static variable through object
        se.m2(); //accessing non-static method through object

        se.m3();
    }
}