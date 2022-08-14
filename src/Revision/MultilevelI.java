package Revision;

class A
{
    void m11()
    {
        System.out.println("This is parent");
    }
}

class B extends A
{
    void m22()
    {
        System.out.println("This is below parent");
    }
}

class C extends B

{
    void m33()
    {
        System.out.println("Below Below");
    }
}

public class MultilevelI extends C {

    public static void main(String[] args) {

        C c = new C();
        c.m11();
    }




}