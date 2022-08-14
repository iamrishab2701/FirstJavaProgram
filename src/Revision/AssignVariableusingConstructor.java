package Revision;



public class AssignVariableusingConstructor {

    int a;
    int b;

    AssignVariableusingConstructor(int x, int y)
    {
        a = x;
        b = y;
    }

    public static void main(String[] args) {

        AssignVariableusingConstructor avc = new AssignVariableusingConstructor(20, 30);
        System.out.println(avc.a +""+ avc.b );


    }
}
