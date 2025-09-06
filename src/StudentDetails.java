//Simple programe of the DATA TYPES...
import java.util.Scanner;
public class StudentDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        int rollNo=sc.nextInt();
        System.out.println("Enter the percentage: ");
        float percentage=sc.nextFloat();
        System.out.println("Enter Grade: ");
        char grade=sc.next().charAt(0);
        System.out.println("Enter result(true/false): ");
        boolean result=sc.nextBoolean();

        System.out.println("\n-----Student Details ----");
        System.out.println("Roll No: "+rollNo);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
        System.out.println("Result (Pass/Fail): "+result);
    }
}
/*
output:
Enter Roll No:
165
Enter the percentage:
89.9
Enter Grade:
A
Enter result(true/false):
true

-----Student Details ----
Roll No: 165
Percentage: 89.9
Grade: A
Result (Pass/Fail): true
 */