package Graph.ShortestPath;

import java.util.*;

public class WeightedDAG {

    // Pair class for (node, weight)
    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    int[] shortestDAG(int v, ArrayList<ArrayList<Pair>> adj, int src) {

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
                for (Pair p : adj.get(node)) {
                    int neigh = p.node;
                    int wt = p.weight;

                    if (dist[node] + wt < dist[neigh]) {
                        dist[neigh] = dist[node] + wt;
                    }
                }
            }
        }

        return dist;
    }

    // DFS for topological sort
    void topoDfs(int node, ArrayList<ArrayList<Pair>> adj,
                 boolean[] visited, Stack<Integer> stk) {

        visited[node] = true;

        for (Pair p : adj.get(node)) {
            if (!visited[p.node]) {
                topoDfs(p.node, adj, visited, stk);
            }
        }
        stk.push(node);
    }

    public static void main(String[] args) {

        int v = 6;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Weighted DAG edges
        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(2, 4));
        adj.get(1).add(new Pair(3, 7));
        adj.get(2).add(new Pair(3, 1));
        adj.get(2).add(new Pair(4, 3));
        adj.get(3).add(new Pair(5, 1));
        adj.get(4).add(new Pair(5, 5));

        WeightedDAG obj = new WeightedDAG();
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
