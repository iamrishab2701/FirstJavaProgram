package Revision;

public class Methods {

    int x = 10;
    int y =20;

    void npnr()
    {
        System.out.println("Not returning any value not returning any parameter");
    }

    int nprr()
    {
        System.out.println("Not returning parameter but returning returning value");
        return x+y;
    }

    void rpnr(int a, int b)
    {
        System.out.println("Returning parameters but not returning value");
        System.out.println(a + "" + b);
    }

    int rprr(int c, int d)
    {
        return c+d;
    }

    public static void main(String[] args) {
        Methods wow = new Methods();
        System.out.println(wow.nprr());
        wow.rpnr(30,40);
        System.out.println(wow.rprr(50,50));

    }
}
