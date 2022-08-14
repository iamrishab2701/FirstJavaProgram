package Practice;
import java.util.Scanner;
public class DivisibleRange {


    void range(int x, int y, int z)
    {
        for(int i = x;i<y;i++)
        {
            if (i%z == 0)
            {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b = input.nextInt();
        System.out.println("Enter the third number");
        int c = input.nextInt();
        DivisibleRange obj1 = new DivisibleRange();
        obj1.range(a,b,c);

    }
}
