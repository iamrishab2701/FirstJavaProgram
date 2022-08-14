package Assignments;

public class Cal {

    int sum(int x, int y)
    {
        return x+y;
    }

    int sum(int x, int y, int z)
    {
        return x+y+z;
    }

    double sum(double x, double y)
    {
        return x+y;
    }

    double sum(double x, double y, double z)
    {
        return x+y+z;
    }

    public static void main(String[] args) {

        Cal ob1 = new Cal();
        System.out.println(ob1.sum(10,20));
        System.out.println(ob1.sum(10,20,30));
        System.out.println(ob1.sum(10,20));
        System.out.println(ob1.sum(10,20,30));
    }
}
