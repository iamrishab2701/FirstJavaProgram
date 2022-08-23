package Practice;

import java.util.ArrayList;

public class UpdateArrayList {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(a);

        a.add(0, 1);
        System.out.println(a);


    }
}
