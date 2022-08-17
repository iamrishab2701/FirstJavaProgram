package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingString {

    public static void main(String[] args) {

        int a[] = {1,3,2,5,4};
        String b[] = {"John","Catty","Matt","Jake"};

        System.out.println("Before sorting" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting" + Arrays.toString(a));

        System.out.println("Before sorting" + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("After sorting" + Arrays.toString(b));



    }
}
