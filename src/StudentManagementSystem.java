//Write a Java program to create a simple Student Management System using classes and objects.
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 85) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 5 students
        Student[] students = new Student[5];

        // Input student details
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            // Create Student object
            students[i] = new Student(id, name, marks);
        }

        // Display details
        System.out.println("\n=== Student Details ===");
        for (Student s : students) {
            s.displayDetails();
        }

        sc.close();
    }
}
/*
output:
Enter details for Student 1
Enter ID: 165
Enter Name: Sneha
Enter Marks: 98
Enter details for Student 2
Enter ID: 166
Enter Name: ram
Enter Marks: 78
Enter details for Student 3
Enter ID: 167
Enter Name: sita
Enter Marks: 78
Enter details for Student 4
Enter ID: 168
Enter Name: raman
Enter Marks: 65
Enter details for Student 5
Enter ID: 169
Enter Name: rakshak
Enter Marks: 87

=== Student Details ===
ID: 165
Name: Sneha
Marks: 98.0
Grade: A
-------------------------
ID: 166
Name: ram
Marks: 78.0
Grade: B
-------------------------
ID: 167
Name: sita
Marks: 78.0
Grade: B
-------------------------
ID: 168
Name: raman
Marks: 65.0
Grade: C
-------------------------
ID: 169
Name: rakshak
Marks: 87.0
Grade: A
-------------------------
 */
