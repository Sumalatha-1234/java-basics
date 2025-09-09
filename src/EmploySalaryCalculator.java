//Write a Java program to calculate the salary of employees
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    // Constructor
    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateHRA() {
        return 0.20 * basicSalary; // 20% of basic
    }

    double calculateDA() {
        return 0.15 * basicSalary; // 15% of basic
    }

    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("---------------------------");
    }
}

public class EmploySalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();

            employees[i] = new Employee(id, name, basic);
        }

        System.out.println("\n=== Employee Details ===");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        sc.close();
    }
}
/*
output:
Enter details for Employee 1
Enter Employee ID: 199
Enter Name: raman
Enter Basic Salary: 15000
Enter details for Employee 2
Enter Employee ID: 200
Enter Name: likitha
Enter Basic Salary: 10000
Enter details for Employee 3
Enter Employee ID: 201
Enter Name: reetu
Enter Basic Salary: 89999

=== Employee Details ===
Employee ID: 199
Name: raman
Basic Salary: 15000.0
Gross Salary: 20250.0
---------------------------
Employee ID: 200
Name: likitha
Basic Salary: 10000.0
Gross Salary: 13500.0
---------------------------
Employee ID: 201
Name: reetu
Basic Salary: 89999.0
Gross Salary: 121498.65000000001
---------------------------
 */
