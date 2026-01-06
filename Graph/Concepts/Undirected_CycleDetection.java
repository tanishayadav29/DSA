package Graph.Concepts;
import java.util.*;
public class Undirected_CycleDetection {

    boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean [] visited= new boolean[v];
        for (int i=0; i<v; i++){
            if(!visited[i]){
                if(dfsRec(adj,i,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfsRec( ArrayList<ArrayList<Integer>> adj, int node, boolean [] visited, int parent){
            visited[node]=true;
            for (int neigh: adj.get(node)){
                if (!visited[neigh]){
                    if (dfsRec(adj,neigh,visited,node)){
                        return true;
                    }
                }
                else if(neigh!=parent){
                        return true;
                    }
            }
            return false;
    }
    public static void main(String[] args) {
        Undirected_CycleDetection obj = new Undirected_CycleDetection();

        int v = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());
            adj.get(0).add(1);
            adj.get(1).add(0);

            adj.get(1).add(2);
            adj.get(2).add(1);

            adj.get(2).add(0);
            adj.get(0).add(2);

            System.out.println(obj.isCycle(v, adj)); // true
        }
}
