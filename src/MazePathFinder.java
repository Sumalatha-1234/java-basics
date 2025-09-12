//The Maze Path Finder
public class MazePathFinder {

    /**
     * Finds if a valid path exists in a maze from (0,0) to (rows-1, cols-1).
     * Time Complexity: O(R * C), where R is the number of rows and C is the number of columns,
     * as each cell is visited at most once.
     * Space Complexity: O(R * C) in the worst-case for the recursive call stack.
     */
    public boolean hasPath(int[][] maze) {
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return false;
        }

        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];

        return findPath(maze, visited, 0, 0, rows - 1, cols - 1);
    }

    private boolean findPath(int[][] maze, boolean[][] visited, int row, int col, int endRow, int endCol) {
        // Base case 1: Check if the current cell is the destination.
        if (row == endRow && col == endCol) {
            return true;
        }

        // Base case 2: Check for invalid moves.
        // - Out of bounds
        // - Is a wall (0)
        // - Has been visited
        if (row < 0 || row > endRow || col < 0 || col > endCol || maze[row][col] == 0 || visited[row][col]) {
            return false;
        }

        // Mark the current cell as visited.
        visited[row][col] = true;

        // Recursive calls for all four possible directions.
        // We use logical OR (||) because if ANY path returns true, the overall result is true.
        boolean foundPath = findPath(maze, visited, row + 1, col, endRow, endCol) || // Down
                findPath(maze, visited, row - 1, col, endRow, endCol) || // Up
                findPath(maze, visited, row, col + 1, endRow, endCol) || // Right
                findPath(maze, visited, row, col - 1, endRow, endCol);  // Left

        // Backtracking: if no path was found from this cell, mark it as unvisited
        // to allow other paths to explore it.
        // This is important for finding ANY path, not just one.
        visited[row][col] = false;

        return foundPath;
    }

    public static void main(String[] args) {
        MazePathFinder finder = new MazePathFinder();

        int[][] maze1 = {
                {1, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1}
        };

        int[][] maze2 = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println("Maze 1 has a path: " + finder.hasPath(maze1)); // Should be true
        System.out.println("Maze 2 has a path: " + finder.hasPath(maze2)); // Should be false
    }
}
/*
output:
Maze 1 has a path: true
Maze 2 has a path: true
 */