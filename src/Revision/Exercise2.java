package Revision;

class car
{

    private int price;
    private String model;

    void start()
    {
        System.out.println("Car Start");
    }
    void stop()
    {
        System.out.println("Car Stop");
    }
    void move()
    {
        System.out.println("Car Move");
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getmodal()
    {
        return model;
    }
}

class Driver
{
    private String name;
    private int age;

    void drive()
    {
        System.out.println("Drive");
    }

    public String getName()
    {
        return name;
    }

    public int getage()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

public class Exercise2 {
}

