//Simple program for creating the user defined the Class...
class Employee{
    int id;
    String name;
    int Salary;

    public void printDetails(){
        System.out.println("The Employee ID is:"+id);
        System.out.println("The name of the Employee is:"+name);
        System.out.println("The Salary of the Employee is:"+Salary);
    }
    public int getSalary(){
        return Salary;
    }
}
public class customClass {
    public static void main(String[] args) {
        Employee harry=new Employee();//Instantiate the object class..
        Employee john=new Employee();//Instantiate the object class..
        //Setting attributes..
        harry.id=101;
        harry.name="CodeWithHarry";
        harry.Salary=20000;
        john.id=102;
        john.name="johnDoe";
        john.Salary=30000;
        //printing the attributes...
        System.out.println(harry.id);
        System.out.println(harry.name);
        System.out.println(harry.Salary);
        System.out.println(john.id);
        System.out.println(john.name);
        System.out.println(john.Salary);
        harry.printDetails();
        john.printDetails();
    }
}
/*
output:
101
CodeWithHarry
20000
102
johnDoe
30000
The Employee ID is:101
The name of the Employee is:CodeWithHarry
The Salary of the Employee is:20000
The Employee ID is:102
The name of the Employee is:johnDoe
The Salary of the Employee is:30000
 */