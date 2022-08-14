package AccessModifiers;

public class Simple
{
    public static void main(String[] args) {

        ABCD obj = new ABCD();
        obj.a=20; //compile time error
        obj.m1(); //compile time error
    }
}
