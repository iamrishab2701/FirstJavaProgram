package Practice;

class ArrayData
{
    int a[] = {11,22,33,44,55,66};

    void ArrayD()
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Index number of " +a[i] + " is" + " "+ i);
        }
    }
}

public class IndexOfArrayElement {

    public static void main(String[] args) {
        ArrayData ad = new ArrayData();
        ad.ArrayD();
    }
}
