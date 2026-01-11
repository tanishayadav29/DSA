package Graph.LeetCode;
import java.util.*;

public class Leetcode_802 {

        public List<Integer> eventualSafeNodes(int[][] graph) {
            int v = graph.length;

            boolean[] visited = new boolean[v];
            boolean[] dfsVis = new boolean[v];
            boolean[] check = new boolean[v];

            for (int i = 0; i < v; i++) {
                if (!visited[i]) {
                    dfsCheck(i, graph, visited, dfsVis, check);
                }
            }

            List<Integer> safeNodes = new ArrayList<>();
            for (int i = 0; i < v; i++) {
                if (check[i]) {
                    safeNodes.add(i);
                }
            }
            return safeNodes;
        }

        boolean dfsCheck(int node, int[][] graph,
                         boolean[] visited, boolean[] dfsVis, boolean[] check) {

            visited[node] = true;
            dfsVis[node] = true;
            check[node] = false;

            for (int neigh : graph[node]) {
                if (!visited[neigh]) {
                    if (dfsCheck(neigh, graph, visited, dfsVis, check)) {
                        return true;
                    }
                } else if (dfsVis[neigh]) {
                    return true;
                }
            }

            dfsVis[node] = false;
            check[node] = true;
            return false;
        }

    public static void main(String[] args) {

        Leetcode_802 sol = new Leetcode_802();

        int[][] graph = {
            {1, 2},
            {2, 3},
            {5},
            {0},
            {5},
            {},
            {}
        };

        System.out.println(sol.eventualSafeNodes(graph));
    }
}
