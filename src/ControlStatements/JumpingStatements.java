package ControlStatements;

public class JumpingStatements {

    public static void main(String args[])
    {

        // Stop the execution when the i value becomes 5 using Break;
        for(int i = 1; i<=10;i++)
        {
            if(i==7)
            {
                break;
            }
            System.out.println(i);
        }


        //Continue
        for(int i = 1; i<=10;i++)
        {
            if(i==3 || i==5 || i==7)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
