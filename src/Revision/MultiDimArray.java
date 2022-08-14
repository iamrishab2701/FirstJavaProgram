package Revision;

class SampleArray1
{
    int a[][] = {{1,2},{3,4},{5,6},{7,8}};

    void display()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}

public class MultiDimArray {

    public static void main(String[] args) {
        SampleArray1 sr = new SampleArray1();
        sr.display();

    }
}
