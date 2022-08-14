package Revision;


class m1
{
    static int v = 10;
    int z = 20;

    static void m1()
    {
        System.out.println(v);
        m1 zz = new m1();
        int zzz = zz.z;
        System.out.println(zzz);
        zz.m2();
    }

    void m2()
    {
        m1();
    }
}
public class StaticMandV {

    public static void main(String[] args) {

        m1 zz = new m1();


    }
}
