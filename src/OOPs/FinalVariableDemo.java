package OOPs;

public class FinalVariableDemo {

     int speed = 40; //final variable, so cannot change that value

    public static void main(String[] args) {

        FinalVariableDemo fm = new FinalVariableDemo();
        fm.speed = 100; //Compile time error
        System.out.println(fm.speed);

    }
}
