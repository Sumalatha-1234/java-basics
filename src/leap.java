//Write a java program to find whether a year entered by the user is a leap or not..
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        /*Leap year condition
        1.Divisible by 4 and Divisible by 100
        OR
        2.Divisible by 400
         */
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("The entered year is a leap year..");
        }else{
            System.out.println("Entered year is not a leap year..");
        }
    }
}
