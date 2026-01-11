package Graph.ShortestPath;

import java.util.*;

public class UnweightedDAG {

    int[] shortestDAG(int v, ArrayList<ArrayList<Integer>> adj, int src) {

        // Step 1: Topological sort
        boolean[] visited = new boolean[v];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                topoDfs(i, adj, visited, stk);
            }
        }

        // Step 2: Distance array
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Step 3: Relax edges in topo order
        while (!stk.isEmpty()) {
            int node = stk.pop();

            if (dist[node] != Integer.MAX_VALUE) {
                for (int neigh : adj.get(node)) {
                    if (dist[node] + 1 < dist[neigh]) {
                        dist[neigh] = dist[node] + 1;
                    }
                }
            }
        }

        return dist;
    }

    // DFS for topological sort
    void topoDfs(int node, ArrayList<ArrayList<Integer>> adj,
                 boolean[] visited, Stack<Integer> stk) {

        visited[node] = true;

        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                topoDfs(neigh, adj, visited, stk);
            }
        }
        stk.push(node);
    }

    public static void main(String[] args) {

        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // DAG edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(5);
        adj.get(4).add(5);

        UnweightedDAG obj = new UnweightedDAG();
        int src = 0;

        int[] dist = obj.shortestDAG(v, adj, src);

        System.out.println("Shortest distance from source " + src + ":");
        for (int i = 0; i < v; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("Node " + i + " -> INF");
            } else {
                System.out.println("Node " + i + " -> " + dist[i]);
            }
        }
    }
}
