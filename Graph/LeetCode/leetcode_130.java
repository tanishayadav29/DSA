package Graph.LeetCode;

public class leetcode_130 {

    int rows, cols;
    int[] di = {-1, 1, 0, 0};
    int[] dj = {0, 0, -1, 1};

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        rows = board.length;
        cols = board[0].length;

        // Border DFS
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(i, 0, board);
            if (board[i][cols - 1] == 'O') dfs(i, cols - 1, board);
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') dfs(0, j, board);
            if (board[rows - 1][j] == 'O') dfs(rows - 1, j, board);
        }

        // Final conversion
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'B') board[i][j] = 'O';
            }
        }
    }

    void dfs(int i, int j, char[][] board) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || board[i][j] != 'O')
            return;

        board[i][j] = 'B';

        for (int k = 0; k < 4; k++) {
            dfs(i + di[k], j + dj[k], board);
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        leetcode_130 obj = new leetcode_130();

        char[][] board = {
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'}
        };

        obj.solve(board);

        // Print output
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
