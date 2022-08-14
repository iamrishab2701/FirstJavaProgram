package Assignments;

interface AI
{
    int a = 10;
    int b = 20;
    void sum();
}

public class AssignInterface implements AI {

    public void sum()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        AI sm = new AssignInterface();
        sm.sum();
    }
}
