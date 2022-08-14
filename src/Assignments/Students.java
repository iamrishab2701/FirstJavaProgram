package Assignments;

import OOPs.Student;

public class Students {

    int sid;
    String sname;
    int sub1;
    int sub2;
    int sub3;
    void getStuData(int id, String name)
    {
        sid = id;
        sname = name;
    }
    void Stumarks(int s1, int s2, int s3)
    {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }
    void totalmarks()
    {
        int total = sub1 + sub2 + sub3;
        System.out.println("Total Marks of"+ sname + "is" + total);
    }
    public static void main(String[] args) {
        Students stu1 = new Students();
        stu1.getStuData(1,"John" );
        stu1.Stumarks(50,50,50);
        stu1.totalmarks();
    }
}