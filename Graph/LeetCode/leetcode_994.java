package Graph.LeetCode;

import java.util.*;

class leetcode_994 {

    public static void main(String[] args) {
        leetcode_994 obj = new leetcode_994();

        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        System.out.println(obj.orangesRotting(grid)); // Output: 4
    }

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int size = q.size();
            int temp = 0;

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int x1 = curr[0];
                int y1 = curr[1];

                for (int k = 0; k < 4; k++) {
                    int x = x1 + dx[k];
                    int y = y1 + dy[k];

                    if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        temp++;
                        q.offer(new int[]{x, y});
                    }
                }
            }
            if (temp != 0) time++;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }
}

