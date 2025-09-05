/*Simple Password Validator
Create a program that asks the user to enter a password.
The program should check if the password meets two simple rules:
It must be at least 6 characters long.
It must contain the character '!'.
Your program should print "Password is valid." or "Password is invalid." accordingly.
Concepts: Scanner for user input, string methods like length() and contains(),
 and if-else statements.
 */
import java.util.Scanner;
public class passwordValidator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.println("Please enter a password:");
        String password = scanner.nextLine();

        // Variable to track if the password is valid
        boolean isValid = true;

        // Check the first condition: password must be at least 6 characters long
        if (password.length() < 6) {
            System.out.println("Password is too short. It must be at least 6 characters long.");
            isValid = false;
        }

        // Check the second condition: password must contain the '!' character
        if (!password.contains("!")) {
            System.out.println("Password must contain the '!' character.");
            isValid = false;
        }

        // Print the final result based on the validation checks
        if (isValid) {
            System.out.println("Password is valid. Welcome!");
        } else {
            System.out.println("Password is invalid. Please try again.");
        }

        // Close the scanner
        scanner.close();
    }
}
/*
output:
Please enter a password:
suma!latha
Password is valid. Welcome!
 */
