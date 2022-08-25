package Revision;

final class Test1
{
     int a = 1;
     int b = 2;

    final int method1(int x, int y)
    {
        return x+y;
    }
}

public class FinalKeyword {
    public static void main(String[] args) {

        Test1 t1 = new Test1();
        System.out.println(t1.method1(20,30));
        t1.a = 3;

    }
}
