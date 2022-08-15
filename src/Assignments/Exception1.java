package Assignments;

public class Exception1 {

    public static void main(String[] args) {
        //Any number divisible by zero
        int a = 2;
        int b[] = null;
        String s="abc";

        try {
            System.out.println(a / 0);
        } catch (Exception e)
        {
            System.out.println(e);
        }

        //Length of the empty array

        try{
            System.out.println(b.length);
        } catch(Exception f)
        {
            System.out.println(f);
        }

        //Convert string to integer

        try
        {
            int x = Integer.parseInt(s);
        }
        catch (Exception g)
        {
            System.out.println(g);
        }

    }
}