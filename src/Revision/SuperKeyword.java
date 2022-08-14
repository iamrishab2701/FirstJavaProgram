package Revision;

class parent1
{
    int a=10;
}

class child1 extends parent1
{
    int a = 20;
    void display()
    {
        System.out.println(super.a); //super keyword point to the instance variable declared in
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        child1 ch = new child1();
        ch.display();
    }
}