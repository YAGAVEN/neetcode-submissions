class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (!isRowValid(board, i, j) ||
                    !isColValid(board, i, j) ||
                    !isBoxValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isRowValid(char[][] board, int row, int col) {
        char k = board[row][col];

        for (int j = 0; j < board.length; j++) {
            if (j != col && board[row][j] == k) {
                return false;
            }
        }
        return true;
    }

    public boolean isColValid(char[][] board, int row, int col) {
        char k = board[row][col];

        for (int i = 0; i < board[0].length; i++) {
            if (i != row && board[i][col] == k) {
                return false;
            }
        }
        return true;
    }

    public boolean isBoxValid(char[][] board, int row, int col) {
        char k = board[row][col];

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (i == row && j == col) {
                    continue;
                }

                if (board[i][j] == k) {
                    return false;
                }
            }
        }

        return true;
    }
}