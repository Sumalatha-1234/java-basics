//Write a program to swap two numbers using bitwise XOR.
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
/*
output:
Before Swap: a = 10, b = 20
After Swap: a = 20, b = 10
 */