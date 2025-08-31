/*
Write a method isPrime(int n) to check if a number is prime.
Then, using a loop, print all prime numbers between two user-input values.
 */
import java.util.Scanner;

public class PrimeRange {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (start end): ");
        int start = sc.nextInt(), end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for(int i = start; i <= end; i++) {
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
}
/*
output:
Enter range (start end): 1 50
Prime numbers between 1 and 50:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 */