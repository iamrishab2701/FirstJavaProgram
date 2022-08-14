package Revision;

class SampleArray
{
    String a[] = {"Hello","This","is","Sparta"};
    void displaywithfor()
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    void displaywithenhancedfor()
    {

        for(String i:a)
        {
            System.out.println(i);
        }
    }
}

public class SingleDimArray {

    public static void main(String[] args) {
        SampleArray ar = new SampleArray();
        ar.displaywithfor();
        ar.displaywithenhancedfor();

    }
}
