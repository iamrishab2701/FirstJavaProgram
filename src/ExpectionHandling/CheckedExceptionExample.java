package ExpectionHandling;

public class CheckedExceptionExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program is Started");
        System.out.println("Program is in progress");

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }*/

        Thread.sleep(500);

        System.out.println("Program is completed");
        System.out.println("Program is exited");

    }
}
