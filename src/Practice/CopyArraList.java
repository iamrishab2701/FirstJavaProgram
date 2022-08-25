package Practice;

import java.util.ArrayList;

public class CopyArraList {

    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<String>();

        a.add("one");
        a.add("Two");
        a.add("Three");
        a.add("Four");

        System.out.println(a);

        ArrayList b = (ArrayList) a.clone();

        System.out.println(b);

    }
}