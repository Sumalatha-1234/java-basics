/*
Write a program that accepts an integer and counts the frequency of each digit (0–9)
using loops. Example: Input → 112233, Output → 1 occurs 2 times, 2 occurs 2 times,
3 occurs 2 times.
 */
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();
        int[] freq = new int[10];

        while(num > 0) {
            int digit = (int)(num % 10);
            freq[digit]++;
            num /= 10;
        }

        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0)
                System.out.println(i + " occurs " + freq[i] + " times");
        }
    }
}
/*
output:
Enter number: 123568349813452345
1 occurs 2 times
2 occurs 2 times
3 occurs 4 times
4 occurs 3 times
5 occurs 3 times
6 occurs 1 times
8 occurs 2 times
9 occurs 1 times
 */