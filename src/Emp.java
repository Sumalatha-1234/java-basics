//Create the class Employee with the following properties and methods...
/*
Salary(property)(int)
getSalary(method returning int)
name(property)(string)
getName(method returning String)
setName(method changing name)
 */
class Person{
    int Salary;
    String name;

    public int getSalary(){
        return Salary;
    }
    public void setName(){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
public class Emp{
    public static void main(String[] args) {
        Person per = new Person();//Instantiating the object class..
        //Setting the Attributes..
        per.name="CodeWithHarry";
        per.Salary=300000;
        //Printing the attributes...
        System.out.println("The name of the Employee is:"+per.name);
        System.out.println("The Salary of the Employee is:"+per.Salary);
    }
}
/*
output:
The name of the Employee is:CodeWithHarry
The Salary of the Employee is:300000
*/