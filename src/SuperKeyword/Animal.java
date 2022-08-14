package SuperKeyword;

public class Animal {

    String color = "white";

    void eating()
    {
        System.out.println("EATING........");
    }

    Animal()
    {
        System.out.println("Animal is created");
    }
}


class Dog extends Animal
{
    String color = "Black";

    Dog()
    {
        super(); //Invoke parent class constructor
        System.out.println("Dog is created");
    }

//    void displaycolor()
//    {
//        System.out.println(color);
//    }
//
    void eating()
    {
        System.out.println("Eating Bread.............");
        super.eating();
    }
}