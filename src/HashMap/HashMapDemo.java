package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //Declaration

        HashMap hm = new HashMap();
        HashMap <Integer,String> hm1 = new HashMap<Integer,String>();

        //Adding pairs into hashmap

        hm1.put(101, "John");
        hm1.put(102, "Scott");
        hm1.put(103, "David");
        hm1.put(104, "Smith");
        hm1.put(105,"Kim");

        System.out.println(hm1);

        //Remove the value from the hashmap(Doesn't have the index format)

        hm1.remove(103);
        System.out.println("After removing the value " + hm1);

        //Reading pairs using for loop

        for(Map.Entry m:hm1.entrySet())
        {
            System.out.println(m.getKey() +" "+m.getValue());
        }

    }

}
