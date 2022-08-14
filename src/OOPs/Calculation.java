package OOPs;

public class Calculation {

    int x = 10;
    int y = 20;

    /*void sm() //Case 1 not taking any parameters and not returning any value
    {
        System.out.println(x+y);
    }*/


    /*int sm() //Case 2 not taking any parameters but returning values
    {
        return(x+y);
    }*/


    /*void sm(int a, int b) // Case 3 Taking parameters but not returning any values
    {
        System.out.println(a+b);
    }*/

    int sm(int a, int b) // Case4 Taking parameters and also returning the values
    {
        return(a+b);
    }

    public static void main(String[] args) {

        Calculation cal=new Calculation();
        //cal.sm(); // Case 1

        /*int res = cal.sm(); //case 2
        System.out.println(res);
        System.out.println(cal.sm());*/

        //cal.sm(100,200); //case3

        System.out.println(cal.sm(100,300)); //Case 4
    }
}