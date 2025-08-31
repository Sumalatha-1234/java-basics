/*
Write a method printFibonacci(int n) that prints the first n terms of
the Fibonacci sequence using a loop.
 */
import java.util.Scanner;

public class Fibonacci {
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
/*
output:
Enter number of terms: 10
0 1 1 2 3 5 8 13 21 34
 */