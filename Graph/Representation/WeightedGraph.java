package Graph.Representation;



import java.util.*;

public class WeightedGraph {

    // Edge structure
    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    int V;
    ArrayList<ArrayList<Edge>> adj;

    // Constructor
    public WeightedGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add directed edge
    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
    }

    // Print graph (optional but useful)
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Edge e : adj.get(i)) {
                System.out.print("(" + e.node + ", " + e.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        WeightedGraph g = new WeightedGraph(5);

        g.addEdge(0, 1, 2);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 3, 1);
        g.addEdge(2, 3, 3);
        g.addEdge(3, 4, 5);

        g.printGraph();
    }
}
