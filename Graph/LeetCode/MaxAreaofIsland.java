package Graph.LeetCode;

public class MaxAreaofIsland {

    public static int maxAreaOfIsland(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[] di = {-1, 1, 0, 0};
        int[] dj = {0, 0, -1, 1};

        int maxArea = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    int area = dfs_rec(i, j, r, c, grid, di, dj);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    static int dfs_rec(int i, int j, int r, int c,
                       char[][] grid, int[] di, int[] dj) {

        if (i < 0 || i >= r || j < 0 || j >= c
                || grid[i][j] == '0' || grid[i][j] == '#') {
            return 0;
        }

        grid[i][j] = '#'; // mark visited
        int area = 1;

        for (int k = 0; k < 4; k++) {
            area += dfs_rec(i + di[k], j + dj[k], r, c, grid, di, dj);
        }

        return area;
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        int maxArea = maxAreaOfIsland(grid);
        System.out.println("Maximum Area of Island: " + maxArea);
    }
}
