package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortinArrayList {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();

        a.add(2);
        a.add(3);
        a.add(4);
        a.add(1);

        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

    }
}
