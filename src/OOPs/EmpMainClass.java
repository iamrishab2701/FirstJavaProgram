package OOPs;

public class EmpMainClass {

    public static void main(String[] args) {

        EmpClass emp1 = new EmpClass(); //creating object
        emp1.eid = 101;
        emp1.ename = "David";
        emp1.sal = 25000.00;
        emp1.deptno = 10;
        emp1.job = "Manager";
        emp1.display();

        EmpClass emp2 = new EmpClass();
        emp2.eid = 102;
        emp2.ename = "John";
        emp2.sal = 55000.00;
        emp2.deptno = 20;
        emp2.job = "CEO";
        emp2.display();
    }
}