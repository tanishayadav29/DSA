package Graph.LeetCode;

public class leetcode_547 {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    void dfs(int city, int[][] isConnected, boolean[] visited) {
        visited[city] = true;

        for (int neigh = 0; neigh < isConnected.length; neigh++) {
            if (isConnected[city][neigh] == 1 && !visited[neigh]) {
                dfs(neigh, isConnected, visited);
            }
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        leetcode_547 obj = new leetcode_547();

        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };

        int provinces = obj.findCircleNum(isConnected);
        System.out.println("Number of Provinces: " + provinces);
    }
}
