//Check if a Sudoku Row is Valid (1–9 without repetition)
import java.util.Scanner;

public class SudokuRowCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] row = new int[9];
        boolean[] seen = new boolean[10];

        System.out.println("Enter 9 numbers for a Sudoku row (1–9):");
        for (int i = 0; i < 9; i++) {
            row[i] = sc.nextInt();
            if (seen[row[i]]) {
                System.out.println("Invalid Sudoku Row");
                return;
            }
            seen[row[i]] = true;
        }

        System.out.println("Valid Sudoku Row!");
    }
}
/*
output:
Enter 9 numbers for a Sudoku row (1–9):
1 2 3 4 5 6 7 8 9
Valid Sudoku Row!
Enter 9 numbers for a Sudoku row (1–9):
4 6 3 4 8 9 2 1 6
Invalid Sudoku Row
 */
