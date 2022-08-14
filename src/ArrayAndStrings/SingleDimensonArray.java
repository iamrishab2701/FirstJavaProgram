package ArrayAndStrings;

public class SingleDimensonArray {

    public static void main(String args[])
    {
        int a[] = new int[5]; //declared array with size 5, starting index is 0 and last index is 4

        //storing/inserting values into array

        a[0] = 700;
        a[1] = 800;
        a[2] = 900;
        a[3] = 1000;
        a[4] = 1100;

        // Another approach to initialize as well as add the value in the array at the same time.
        int b[] = {100,200,300,400,500};

        //To find out length of an array a.length

        System.out.println("Length of array is" +a.length);

        System.out.println(b[2]); // read specific value

        for(int i=0;i<b.length;i++) //we can also rigth (int i=0;i<+b.length-1;i++)
        {
            System.out.println(b[i]);
        }

        //Read value using Enchance for loop or Advance for loop

        for(int i:a)
        {
            System.out.println(i);
        }

    }
}
