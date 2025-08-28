//Create a class cellPhone with methods "ringing...","vibrating.."etc...
import java.util.Scanner;
class user {
    public void ringing(int i) {
        if (i == 0) {
            System.out.println("Don't pick the phone...");
        } else {
            System.out.println("Your wish to pick the call...");
            System.out.println("Always pick the call...");
        }
    }

    static void vibrate(int j) {
        if (j == 0) {
            System.out.println("The phone will not vibrate...");
        } else {
            System.out.println("The phone will vibrate...");
        }
    }
}
public class phoneCell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        user us=new user();//Initiating the object for the class...
        System.out.println("Enter your choice:");
        us.ringing(sc.nextInt());
        System.out.println("Enter your choice:");
        us.vibrate(sc.nextInt());

    }
}
/*
output:
Enter your choice:
1
Your wish to pick the call...
Always pick the call...
Enter your choice:
0
The phone will not vibrate...
 */