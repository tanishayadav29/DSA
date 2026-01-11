package Graph.ShortestPath;
import java.util.*;

public class UnweightedGraph {

    int[] shortest(int v, ArrayList<ArrayList<Integer>> adj, int src) {
        int[] dist = new int[v];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neigh : adj.get(node)) {
                if (dist[neigh] == -1) {
                    dist[neigh] = dist[node] + 1;
                    q.add(neigh);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int v = 6; // number of vertices

        // adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // edges (undirected graph)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(3).add(5);
        adj.get(5).add(3);

        UnweightedGraph obj = new UnweightedGraph();
        int src = 0;

        int[] dist = obj.shortest(v, adj, src);

        System.out.println("Shortest distance from source " + src + ":");
        for (int i = 0; i < v; i++) {
            System.out.println("Node " + i + " -> " + dist[i]);
        }
    }
}
