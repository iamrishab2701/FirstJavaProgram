package Revision;

import java.util.ArrayList;

public class ArrayEx2 {

    public static void main(String[] args) {

        //Write a Java program to iterate through all elements in a array list.

        ArrayList l2 = new ArrayList();
        l2.add("add");
        l2.add(100);
        l2.add("Blue");
        l2.add('A');

        for(Object i:l2)
        {
            System.out.println(i);
        }

        for(int i=0;i<l2.size();i++)
        {
            System.out.println(l2.get(i));
        }
    }
}
