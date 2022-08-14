package OOPs;

public class StudentMain {
    public static void main(String[] args) {
        Student stu1 = new Student(101,"John",'A'); //Using constructor

        //Assigning values using object reference variable
//        stu1.sid = 101;
//        stu1.name = "John";
//        stu1.grade = 'A';

        //Assiging the values using method
//        stu1.getValues(101,"John",'A');
        stu1.display();


    }
}