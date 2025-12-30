package Graph.LeetCode;


public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[] di = {-1, 1, 0, 0};
        int[] dj = {0, 0, -1, 1};

        int res = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs_rec(i, j, r, c, grid, di, dj);
                }
            }
        }
        return res;
    }

    static void dfs_rec(int i, int j, int r, int c,
                        char[][] grid, int[] di, int[] dj) {

        if (i < 0 || i >= r || j < 0 || j >= c
                || grid[i][j] == '0' || grid[i][j] == '#') {
            return;
        }

        grid[i][j] = '#'; // mark visited

        for (int k = 0; k < 4; k++) {
            dfs_rec(i + di[k], j + dj[k], r, c, grid, di, dj);
        }
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        int islands = numIslands(grid);
        System.out.println("Number of Islands: " + islands);
    }
}
