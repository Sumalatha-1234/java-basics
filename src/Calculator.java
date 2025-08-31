/*
Implement a calculator using switch-case and methods.
The menu should allow the user to choose operations:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Each operation should be written as a separate method.
 */
import java.util.Scanner;

public class Calculator {
    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static double divide(int a, int b) { return (b != 0) ? (double)a / b : 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Add  2.Subtract  3.Multiply  4.Divide  5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if(choice == 5) break;

            System.out.print("Enter two numbers: ");
            int x = sc.nextInt(), y = sc.nextInt();

            switch(choice) {
                case 1: System.out.println("Result = " + add(x, y)); break;
                case 2: System.out.println("Result = " + subtract(x, y)); break;
                case 3: System.out.println("Result = " + multiply(x, y)); break;
                case 4: System.out.println("Result = " + divide(x, y)); break;
                default: System.out.println("Invalid choice!");
            }
        } while(choice != 5);
    }
}
/*
output:
1.Add  2.Subtract  3.Multiply  4.Divide  5.Exit
Enter choice: 3
Enter two numbers: 12 3
Result = 36

1.Add  2.Subtract  3.Multiply  4.Divide  5.Exit
Enter choice: 2
Enter two numbers: 8 4
Result = 4

1.Add  2.Subtract  3.Multiply  4.Divide  5.Exit
Enter choice: 1
Enter two numbers: 89 70
Result = 159

1.Add  2.Subtract  3.Multiply  4.Divide  5.Exit
Enter choice: 4
Enter two numbers: 8 4
Result = 2.0

1.Add  2.Subtract  3.Multiply  4.Divide  5.Exit
Enter choice: 5
 */