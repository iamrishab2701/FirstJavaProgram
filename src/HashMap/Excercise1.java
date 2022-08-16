package HashMap;

import java.util.HashMap;

public class Excercise1 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put("Red", 1);
        hm.put("Blue", 2);
        hm.put("Orange",3);
        hm.put("Yellow",4);

        if(hm.containsKey("Red"))
        {
            System.out.println("Yes it exits");
        }
        else
        {
            System.out.println("No it doesn't");
        }
    }
}