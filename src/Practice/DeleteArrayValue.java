package Practice;

import java.sql.Array;

class ArrayDel
{
    int a[] = {1,2,3};
    int removeindex = 1;
    public void removearrayvalue()
    {
        for(int i = removeindex;i<a.length-1;i++)
            a[i] = a[i+1];
        }
}
public class DeleteArrayValue {

    public static void main(String[] args) {

        ArrayDel ad = new ArrayDel();
        ad.removearrayvalue();
        System.out.println();
    }
}
