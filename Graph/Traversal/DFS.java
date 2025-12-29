package Graph.Traversal;
import java.util.*;

class Graph_dfs_traversal{
    private Map<Integer,List<Integer>> graph;

    Graph_dfs_traversal(){
        graph = new HashMap<>();
    }


    void addEdge(int u, int v){
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
    }

    void dfs_rec(int vertex, Set<Integer> visited){
        visited.add(vertex);
        System.out.print(vertex+" ");
        if (graph.containsKey(vertex)){
            for (int neighbour:graph.get(vertex)){
                if (!visited.contains(neighbour)){
                    dfs_rec(neighbour, visited);
                }
            }
        }
    }

    void dfs(int start){
        Set<Integer> visited= new HashSet<>();
        dfs_rec(start, visited);
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph_dfs_traversal g = new Graph_dfs_traversal();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        System.out.print("DFS Traversal: ");
        g.dfs(0);
    }
}
