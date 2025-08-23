//Write a program to find the type of website from the url....
import java.util.Scanner;
public class URL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file type:");
        String url=sc.next();
        if(url.endsWith(".com")){
            System.out.println("The entered file is .com");
            //if url is https://www.indiancommity.com
            //then it is .com file
        }else if(url.endsWith(".org")){
            System.out.println("The entered file is .org");
            //if url is https://www.indiancommity.org
            //then it is .org file
        }else if(url.endsWith(".in")){
            System.out.println("The entered file is .in");
            //if url is https://www.indiancommity.in
            //then it is .in file
        }
    }
}
