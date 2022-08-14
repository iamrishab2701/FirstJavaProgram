package Revision;

class Parent
{
    void parentmethod()
    {
        System.out.println("This is parent");
    }
}

public class SingleInheritence extends Parent {

    public static void main(String[] args) {
        Parent si = new SingleInheritence();
        si.parentmethod();
    }
}
