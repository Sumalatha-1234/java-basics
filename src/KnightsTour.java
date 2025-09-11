//Knight's Tour Problem Code..
public class KnightsTour {

    private static int N = 8;
    private static int[][] board;
    private static int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        solveKnightsTour();
    }

    public static void solveKnightsTour() {
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }

        int startRow = 0;
        int startCol = 0;
        board[startRow][startCol] = 0; // The first move is at position (0,0)

        if (solveTourUtil(startRow, startCol, 1)) {
            System.out.println("Solution found!");
            printBoard();
        } else {
            System.out.println("Solution does not exist.");
        }
    }

    private static boolean solveTourUtil(int x, int y, int moveCount) {
        if (moveCount == N * N) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nextX = x + xMove[i];
            int nextY = y + yMove[i];

            if (isSafe(nextX, nextY)) {
                board[nextX][nextY] = moveCount;
                if (solveTourUtil(nextX, nextY, moveCount + 1)) {
                    return true;
                } else {
                    board[nextX][nextY] = -1; // Backtrack
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    private static void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%3d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
/*
output:
Solution found!
  0  59  38  33  30  17   8  63
 37  34  31  60   9  62  29  16
 58   1  36  39  32  27  18   7
 35  48  41  26  61  10  15  28
 42  57   2  49  40  23   6  19
 47  50  45  54  25  20  11  14
 56  43  52   3  22  13  24   5
 51  46  55  44  53   4  21  12
 */