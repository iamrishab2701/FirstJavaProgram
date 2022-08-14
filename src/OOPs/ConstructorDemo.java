package OOPs;

public class ConstructorDemo {

    int x;
    int y;

    ConstructorDemo() //DefaultConstructor
    {
        x=10;
        y=20;
    }

    ConstructorDemo(int x, int y) //Parameterized Constructor
    {
        this.x=x;
        this.y=y;
    }

    void display()
    {
        System.out.println(x+y);
    }


    public static void main(String[] args) {
        ConstructorDemo cm1 = new ConstructorDemo(); //Invokes default constructor
        cm1.display();
        ConstructorDemo cm2 = new ConstructorDemo(100,200); //Invokes parameterized constructor
        cm2.display();
    }
}
