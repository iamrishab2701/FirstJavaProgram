package ArrayAndStrings;

public class AssignmentsArrays {

    public static void main(String[] args) {

        //Q1 - Write a java program to calculate sum values of an array

        int a[]={1,2,3,4,5,6};
        String b[]= {"Hello","this","is","Rishab"};
        int c[][] = {{1,2},{3,4}};
        int d[][] = {{5,6},{7,8}};
        int row = 2;
        int col = 2;
        int e[][]=new int[row][col];
        int sum = 0;
        int large = 0;
        int small = 0;
        System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]); //This is the solution if the array length is known


        for(int i=0;i<a.length;i++) //this solution is when the length of array is not know
        {
            sum = sum + a[i];
        }
        System.out.println(sum);
        //Q2- Write a java program to search specific number in an array
        //let's say if i am looking for number 5 as value in an array

        for(int i=0;i<a.length;i++)
        {
            if(a[i] == 2)
            {
                System.out.println("Yes it is available");
            }
        }

        //Q3 - Define an array with some string values, write a java program to search specific string in an array

        for(int i=0;i<b.length;i++)
        {
            if(b[i] == "Rishab")
            {
                System.out.println("Yes String is available");
            }
        }

        //Q4 - Write a java program to print even and odd numbers in an array

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2 == 0)
            {
                System.out.println("Even number:");
                System.out.println(a[i]);
            }
            else if (a[i]%2 != 0)
            {
                System.out.println("Odd Number:");
                System.out.println(a[i]);
            }
        }

        //Write a program to find the greatest and smallest element in an array

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>large)
            {
                large = a[i];
            } else if (a[i]<small)
            {
                small = a[i];
            }

        }
        System.out.println("Large number is: " + large);
        System.out.println("Small number is: " + small);


        //Write a program to add two matrices
        for(int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                e[i][j] = c[i][j] + d[i][j];
                System.out.println(e[i][j] + "");
            }
        }



        }



    }