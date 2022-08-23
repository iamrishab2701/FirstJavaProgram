package Practice;

import java.util.ArrayList;

public class ArrayListRetrieve {

    public static void main(String[] args) {

        ArrayList <String>a = new ArrayList<String>();
        a.add("One");
        a.add("Two");
        a.add("Three");
        a.add("Four");

        System.out.println(a);
        System.out.println(a.get(3));

    }
}
