package ControlStatements;

public class NestedIfElse {

    public static void main(String args[])
    {
        // Based of day should tell name of the weekday
        int day = 8;

        if(day==1)
        {
            System.out.println("It is Sunday");
        }
        else if (day==2)
        {
            System.out.println("It is Monday");
        } else if (day==3)
        {
            System.out.println("It is Tuesday");
        } else if (day==4)
        {
            System.out.println("It is Wednesday");
        } else if (day==5)
        {
            System.out.println("Thursday");
        } else if (day==6)
        {
            System.out.println("Friday");
        }
        else if (day==7)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("Invalid week number");
        }
    }
}
