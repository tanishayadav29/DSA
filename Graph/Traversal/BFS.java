package Graph.Traversal;
import java.util.*;

class Graph_bfs_traversal{
    private Map<Integer,List<Integer>> graph = new HashMap<>();
    void addEdge(int u, int v){
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
    }
    List <Integer> bfs( int start){
        List <Integer> traversal= new ArrayList<>();
        Set<Integer> visited= new HashSet<>();
        Queue<Integer> queue= new ArrayDeque<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()){
            int vertex=queue.poll();
            traversal.add(vertex);

            for(int neighbor: graph.get(vertex)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return traversal;
    }
}
public class BFS {
    public static void main(String[] args) {
        Graph_bfs_traversal obj= new Graph_bfs_traversal();
        obj.addEdge(0, 1);
        obj.addEdge(1, 0);
        obj.addEdge(0, 2);
        obj.addEdge(2, 0);
        obj.addEdge(1, 2);
        obj.addEdge(2, 1);

        List<Integer> ans= obj.bfs(0);
        System.out.println("BFS traversal is: "+ans);
    }
}
