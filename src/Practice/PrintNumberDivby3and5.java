package Practice;

public class PrintNumberDivby3and5 {

    public static void main(String[] args) {
        System.out.println("\nDivided by 3: ");
        for(int i = 0;i<100;i++)
        {
            if(i%3 == 0)
            {
                System.out.println(i + ", ");
            }
        System.out.println("\n\nDivided by 5: ");
        for(int j = 0;j<100;j++)
            if (i%5==0)
            {
                System.out.println(j + ",");
            }

            System.out.println("\n\nDivided by 3 & 5: ");
        for(int k = 0;k<100;k++)
            if (i%3 == 0 && i%5 == 0)
            {
                System.out.println(k + ", ");
            }
        }
        System.out.println("\n");
    }
}
