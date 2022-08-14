package ExpectionHandling;

public class ExceptionExamples {

    public static void main(String[] args) {

        System.out.println("Program is Started");
        System.out.println("Program is In Progress");

        int a = 100;

        try {
            System.out.println(100 / 0); // This will throw arithmetic exception
        }
        catch (ArithmeticException f)
        {
            System.out.println("Enter into catch block");
        }

        String s = null;

        try {
            System.out.println(s.length()); // This will throw Null pointer exception
        }
        catch(Exception g)
        {
            System.out.println("Enter into catch again");
            System.out.println(g);
        }

        String c = "123";
        try {
            int x = Integer.parseInt(c); // This will throw Number format exception
        }
        catch (NumberFormatException h)
        {
            System.out.println("Entered into catch one more time");
        }

        int d[] = new int[5];
        try {
            d[10] = 50; //Array index out of bound exception
        }
        catch (IndexOutOfBoundsException j)
        {
            System.out.println("AGAIN!!!!");
        }

        System.out.println("Program is completed");
        System.out.println("Program is exited");

    }
}
