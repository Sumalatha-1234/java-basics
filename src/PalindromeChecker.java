/*Create a class PalindromeChecker with:
A method isPalindrome(String str) that returns true if the string is palindrome.
Modify the method so that it ignores spaces, punctuation, and case sensitivity.
Example: "A man, a plan, a canal: Panama" → should be detected as palindrome.
 */
import java.util.Scanner;
public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        // Convert to lowercase and remove spaces/punctuation
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Reverse using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("The String is a Palindrome.");
            return true;
        } else {
            System.out.println("The String is NOT a Palindrome.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker();
        pc.isPalindrome(input);
    }
}
/*
output:
Enter a string: madam
The String is a Palindrome.
Enter a string: Car
The String is NOT a Palindrome.
 */