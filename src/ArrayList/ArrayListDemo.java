package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // We can store any type of elements in this type of ArrayList
        ArrayList <String> list1 = new ArrayList <String>(); //Only String
        ArrayList <Integer> list2 = new ArrayList<Integer>(); //Only Integer

        //Adding values to arrayList
        list1.add("John");
        list1.add("David");
        list1.add("Scott");
        list1.add("Smith");
        list.add("This");
        list.add('I');
        list.add(100);

        //Size of the arraylist

        System.out.println(list1.size());
        System.out.println("Before removing element " + list1);
        System.out.println(list.size());
        System.out.println("Before removing element " + list);

        //Remove an element

        list1.remove(2); //remove scott
        System.out.println(list1.size());
        System.out.println("After removing the elements " + list1);

        //Inserting a new element into arraylist

        list1.add(1,"Mark");
        System.out.println(list1.size());
        System.out.println("After inserting new element " + list1);

        //Read values from arraylist using for loop
        for(String s:list1)
        {
            System.out.println(s);
        }

        for(Object a:list)
        {
            System.out.println(a);
        }


    }
}