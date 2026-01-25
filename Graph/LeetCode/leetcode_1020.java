package Graph.LeetCode;

public class leetcode_1020 {

    int rows, cols, moves;
    int[] di = {-1, 1, 0, 0};
    int[] dj = {0, 0, -1, 1};

    public int numEnclaves(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        rows = grid.length;
        cols = grid[0].length;
        moves = 0;   // reset

        // Boundary DFS
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 1) dfs(i, 0, grid);
            if (grid[i][cols - 1] == 1) dfs(i, cols - 1, grid);
        }

        for (int j = 0; j < cols; j++) {
            if (grid[0][j] == 1) dfs(0, j, grid);
            if (grid[rows - 1][j] == 1) dfs(rows - 1, j, grid);
        }

        // Count remaining land
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    moves++;
                }
            }
        }
        return moves;
    }

    void dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != 1)
            return;

        grid[i][j] = 0;

        for (int k = 0; k < 4; k++) {
            dfs(i + di[k], j + dj[k], grid);
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        leetcode_1020 obj = new leetcode_1020();

        int[][] grid = {
            {0,0,0,0},
            {1,0,1,0},
            {0,1,1,0},
            {0,0,0,0}
        };

        int ans = obj.numEnclaves(grid);
        System.out.println("Number of Enclaves: " + ans);
    }
}
