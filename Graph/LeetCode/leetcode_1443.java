package Graph.LeetCode;

import java.util.*;

public class leetcode_1443 {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        if (n == 0)
            return 0;

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return dfs(0, -1, graph, hasApple);
    }

    private int dfs(int node, int parent, Map<Integer, List<Integer>> graph, List<Boolean> hasApple) {
        int cost = 0;

        for (int child : graph.get(node)) {
            if (child == parent)
                continue;

            int childCost = dfs(child, node, graph, hasApple);

            if (childCost > 0 || hasApple.get(child)) {
                cost += childCost + 2;
            }
        }
        return cost;
    }

    // 🔥 main method
    public static void main(String[] args) {
        leetcode_1443 obj = new leetcode_1443();

        int n = 7;
        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 4},
            {1, 5},
            {2, 3},
            {2, 6}
        };

        List<Boolean> hasApple = Arrays.asList(
            false,  // 0
            false,  // 1
            true,   // 2
            false,  // 3
            true,   // 4
            true,   // 5
            false   // 6
        );

        int result = obj.minTime(n, edges, hasApple);
        System.out.println("Minimum time to collect all apples: " + result);
    }
}
