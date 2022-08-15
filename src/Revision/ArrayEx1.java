//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

package Revision;

import java.util.ArrayList;

public class ArrayEx1 {

    public static void main(String[] args) {

        ArrayList <String> l1 = new ArrayList<String>();

        l1.add("Red");
        l1.add("Yellow");
        l1.add("Blue");

        System.out.println(l1);
    }
}
