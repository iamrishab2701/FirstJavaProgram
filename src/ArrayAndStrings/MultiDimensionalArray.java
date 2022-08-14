package ArrayAndStrings;

public class MultiDimensionalArray {

    public static void main(String args[])
    {
        // specifiying the size then assigning a value to an array
        int a[][] = new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;

        //Assigning the value to the array directly without specifying the size

        int b[][]={{100,200}, {300,400}, {500,600}, {700,800}};

        System.out.println(a.length); // to find number of rows
        System.out.println(a[0].length); // to find number of column under that row.

        //Read values from multi-dimensional array using classic for loop or we can call it as nested for loop.

        for(int i=0;i<a.length;i++) //outerloop
        {
            for (int j=0;j<a[i].length;j++) //innerloop
            {
                System.out.println(a[i][j]);
            }
        }

        //Enhanced for loop for multi-dimensional array

        for(int i[]:b)
        {
            for (int j:i)
            {
                System.out.println(j);
            }
        }
    }
}
