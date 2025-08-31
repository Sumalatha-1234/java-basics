/*Write a program that takes an integer as input and reverse it using a loop inside a
a method.Example:12345 -> 54321*/
import java.util.Scanner;
public class numRev {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
     int num=sc.nextInt();
        System.out.println("Reversed: "+reverse(num));
    }
}
/*
output:
Enter the number to be reversed:
12345
Reversed: 54321
 */