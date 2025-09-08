/*Write a Java program that determines whether a given positive integer is a prime number or not.
 A prime number is a natural number greater than 1 that has no positive divisors other
 than 1 and itself
 */
public class PrimeChecker {

    /**
     * Checks if a given positive integer is a prime number.
     *
     * @param number The integer to be checked.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        // Prime numbers are greater than 1.
        // A number less than or equal to 1 is not a prime number.
        if (number <= 1) {
            return false;
        }

        // We only need to check for divisors up to the square root of the number.
        // If a number has a divisor larger than its square root, it must also have
        // a corresponding divisor that is smaller than its square root.
        for (int i = 2; i * i <= number; i++) {
            // If the number is divisible by any integer from 2 up to its square root,
            // it is not a prime number. The '%' operator checks for the remainder.
            if (number % i == 0) {
                return false; // Found a divisor, so it's not prime.
            }
        }

        // If the loop completes without finding any divisors, the number is prime.
        return true;
    }

    /**
     * Main method to demonstrate the functionality of the isPrime method.
     */
    public static void main(String[] args) {
        int number1 = 29;
        int number2 = 42;
        int number3 = 1;

        // Test the first number and print the result.
        if (isPrime(number1)) {
            System.out.println(number1 + " is a prime number.");
        } else {
            System.out.println(number1 + " is not a prime number.");
        }

        // Test the second number and print the result.
        if (isPrime(number2)) {
            System.out.println(number2 + " is a prime number.");
        } else {
            System.out.println(number2 + " is not a prime number.");
        }

        // Test a non-positive integer.
        if (isPrime(number3)) {
            System.out.println(number3 + " is a prime number.");
        } else {
            System.out.println(number3 + " is not a prime number.");
        }
    }
}
/*
output:
29 is a prime number.
42 is not a prime number.
1 is not a prime number.
 */
