//Check if a Number is Strong (Sum of factorials of digits = number)
import java.util.Scanner;

public class StrongNumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        if (sum == temp)
            System.out.println(temp + " is a Strong Number");
        else
            System.out.println(temp + " is NOT a Strong Number");
    }
}
/*
output:
Enter a number: 567890
567890 is NOT a Strong Number
 */