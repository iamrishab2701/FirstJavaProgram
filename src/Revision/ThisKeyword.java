package Revision;

public class ThisKeyword {

    int a=1;
    int b=2;

    int m1(int a, int b)
    {
        System.out.println(this.a);
        this.a = a;
        this.b = b;

        return  a+b;
    }
    public static void main(String[] args) {

        ThisKeyword tk = new ThisKeyword();
        System.out.println(tk.m1(20,30));

    }
}
