package Graph.LeetCode;

import java.util.*;

public class leetcode_797 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(0, graph, path, n);
        return result;
    }

    private void dfs(int node, int[][] graph, List<Integer> path, int n) {
        if (node == n - 1) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int neigh : graph[node]) {
            path.add(neigh);
            dfs(neigh, graph, path, n);
            path.remove(path.size() - 1);
        }
    }

    // ===== main method for system run =====
    public static void main(String[] args) {
        leetcode_797 sol = new leetcode_797();

        int[][] graph = {
            {1, 2},
            {3},
            {3},
            {}
        };

        List<List<Integer>> ans = sol.allPathsSourceTarget(graph);
        System.out.println(ans);
    }
}
