package Assignments;

class Teacher
{
    String Designation = "Teacher";
    String CollegeName = "Beginnersbook";

    void does()
    {
        System.out.println("Teaching");
    }
}

class ComputerTeacher extends Teacher
{

}

public class AssignmentInheritance {

    public static void main(String[] args) {

        ComputerTeacher ct = new ComputerTeacher();
        ct.does();
        System.out.println(ct.Designation);
        System.out.println(ct.CollegeName);
    }
}
