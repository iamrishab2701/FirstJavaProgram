package Practice;

import java.util.Arrays;

public class AverageArrayValue {

    public static void main(String[] args) {

        //Write a Java program to calculate the average value of array elements.

        int a[] = {1,2,3,4,5,6,7,8};
        int sum = 0;

        for(int i = 0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        double avg = sum/a.length;
        System.out.println(avg);

    }
}