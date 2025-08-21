//Write a java program to convert kilometer to miles.....
import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float kilometer=0.621371f;
        System.out.println("Enter the kilometer to find:");
        int kilo=sc.nextInt();
        System.out.println("The conversion of the miles is:");
        float res=kilo*kilometer;
        System.out.println(res);
    }
}
