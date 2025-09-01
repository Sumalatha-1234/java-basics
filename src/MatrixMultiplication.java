//Matrix Multiplication (2D Arrays)
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols of first matrix / rows of second matrix: ");
        int c1 = sc.nextInt();
        System.out.print("Enter cols of second matrix: ");
        int c2 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[c1][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < c1; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
output:
Enter rows of first matrix: 3
Enter cols of first matrix / rows of second matrix: 3
Enter cols of second matrix: 3
Enter first matrix:
1 2 3
4 5 6
7 8 9
Enter second matrix:
9 8 7
6 5 4
3 2 1
Resultant Matrix:
30 24 18
84 69 54
138 114 90
 */
