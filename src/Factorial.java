/*
Write a method factorial(int n) that calculates factorial using a loop.
Then call it from the main program for multiple test cases (user decides how many times).
 */
import java.util.Scanner;

public class Factorial {
    static long factorial(int n) {
        long fact = 1;
        for(int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many test cases? ");
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            System.out.println("Factorial = " + factorial(n));
        }
    }
}
/*
output:
How many test cases? 12
Enter number: 0
Factorial = 1
Enter number: 1
Factorial = 1
Enter number: 2
Factorial = 2
Enter number: 3
Factorial = 6
Enter number: 4
Factorial = 24
Enter number: 5
Factorial = 120
Enter number: 6
Factorial = 720
Enter number: 7
Factorial = 5040
Enter number: 8
Factorial = 40320
Enter number: 9
Factorial = 362880
Enter number: 10
Factorial = 3628800
Enter number: 11
Factorial = 39916800
 */