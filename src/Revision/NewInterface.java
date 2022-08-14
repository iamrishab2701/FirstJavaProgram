package Revision;

public interface NewInterface {

    default void m1inside(int x, int y)
    {
        System.out.println("Test");
    }
}

class inside implements NewInterface
{
    public static void main(String[] args) {

        NewInterface ss = new inside();
        ss.m1inside(20,30);
    }
}
