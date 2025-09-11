/*The N-Queens Problem is a classic puzzle in computer science and a great
 example of a problem that can be solved using backtracking.
 */
import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {

    public static void main(String[] args) {
        int n = 4; // You can change N to any integer > 0
        List<List<String>> solutions = solveNQueens(n);
        System.out.println("Found " + solutions.size() + " solutions for " + n + "-queens:");
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(result, board, 0);
        return result;
    }

    private static void backtrack(List<List<String>> result, char[][] board, int col) {
        if (col == board.length) {
            result.add(constructSolution(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(result, board, col + 1);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check row on left side
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }
}
/*
output:
Found 2 solutions for 4-queens:
..Q.
Q...
...Q
.Q..

.Q..
...Q
Q...
..Q.
 */