/*Create a Person class with a parameterized constructor to initialize name and age.
Create a subclass Student that calls the Person constructor using super() and adds roll number.
Write a program to print all details.*/
class person{
    person(){
        String name="Sumalatha";
        int age=21;
        System.out.println("My name is: "+name);
        System.out.println("My age is: "+age);
    }
}
class Student extends person{
    Student(){
        super();
        int rollNo=165;
        System.out.println("My roll number is: "+rollNo);
    }
}
public class inherit3 {
    public static void main(String[] args) {
        Student s=new Student();
    }
}
/*
output:
My name is: Sumalatha
My age is: 21
My roll number is: 165
 */
