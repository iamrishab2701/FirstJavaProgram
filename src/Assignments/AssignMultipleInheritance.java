package Assignments;

interface ADD
{
    int a = 10;
    int b = 20;
    void sum();
}

interface MUL
{
    int x = 10;
    int y = 20;
    void mul();
}

public class AssignMultipleInheritance implements ADD,MUL {

    public void sum()
    {
        System.out.println(a+b);
    }

    public void mul()
    {
        System.out.println(x*y);
    }

    public static void main(String[] args) {

        AssignMultipleInheritance obj1 = new AssignMultipleInheritance();
        obj1.sum();
        obj1.mul();
    }
}
