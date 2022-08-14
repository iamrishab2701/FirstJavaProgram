package OOPs.Interface;

interface A
{
  int a = 10;  //By Default variable in interface are static and final

  void m1(); // Abstract method, by default public
}



public class Test implements A {

     public void m1()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
//        Test t = new Test();
//        t.m1();

        A a = new Test();
        a.m1();
    }
}
