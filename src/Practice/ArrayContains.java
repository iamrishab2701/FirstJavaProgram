package Practice;

import java.util.Scanner;

public class ArrayContains {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6};

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int b = input.nextInt();

        for(int i = 0;i<a.length;i++)
        {
            if(a[i] == b)
            {
                System.out.println("Value is present in the array");
            }
            }
        }
    }
