/*Given an array of integers, write a Java program to calculate the sum of all
the even numbers present in the array.*/
public class EvenNumberSum {

    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0; // Initialize a variable to store the sum

        // Loop through each element in the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the current number is even
            if (numbers[i] % 2 == 0) {
                sum += numbers[i]; // Add the even number to the sum
            }
        }
        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = calculateSumOfEvenNumbers(myArray);

        System.out.println("The sum of even numbers is: " + result); // Expected output: 30
    }
}
/*
output:
The sum of even numbers is: 30
 */