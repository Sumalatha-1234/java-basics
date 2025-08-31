/*
Use nested loops and a method to print the following pattern (for n=5):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
import java.util.Scanner;

public class NumberPattern {
    static void printPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
/*
output:
Enter n: 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */