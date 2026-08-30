public class NQueens {

    static int N = 4;

    static boolean isSafe(char[][] board, int row, int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < N;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static boolean solve(char[][] board, int row) {

        // All queens placed
        if (row == N) {
            return true;
        }

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                // Place queen
                board[row][col] = 'Q';

                // Move to next row
                if (solve(board, row + 1)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    static void printBoard(char[][] board) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = new char[N][N];

        // Fill board with empty spaces
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '.';
            }
        }

        if (solve(board, 0)) {
            System.out.println("Solution:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}