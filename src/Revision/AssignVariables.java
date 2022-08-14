package Revision;


class variableclass
{
    int a,b,c,d;

    void viamethod()
    {
        c = 30;
        d = 40; //assigning values using variable
    }
}


public class AssignVariables {
    public static void main(String[] args) {

        variableclass vc = new variableclass();
        vc.a = 10;
        vc.b = 20; // Using objects assigning a variable
        System.out.println(vc.c + "and" + vc.d);
    }
}
