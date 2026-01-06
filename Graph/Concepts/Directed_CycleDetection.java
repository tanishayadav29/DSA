package Graph.Concepts;

import java.util.ArrayList;

public class Directed_CycleDetection {
    boolean check(int v,ArrayList<ArrayList<Integer>> adj){
        boolean [] visited = new boolean[v];
        boolean [] dfs_visited= new boolean[v];

        for (int i=0; i<v;i++){
            if(!visited[i]){
                if(dfs(i, adj, visited,dfs_visited)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int node,ArrayList<ArrayList<Integer>> adj, boolean [] visited, boolean [] dfs_visited ){
        visited[node]=true;
        dfs_visited[node]=true;
        for(int neigh:adj.get(node)){
            if (!visited[neigh]){
                if( dfs(neigh, adj, visited, dfs_visited)){
                    return true;
                }
            }
            else if( dfs_visited[neigh]){
                    return true;
            }
        }
        dfs_visited[node]= false;
        return false;
    }
    
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example 1: Graph with cycle 0->1->2->3->1
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);

        Directed_CycleDetection obj = new Directed_CycleDetection();
        boolean hasCycle = obj.check(V, adj);

        System.out.println("Graph has cycle? " + hasCycle);

        // Example 2: Graph without cycle
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V; i++) adj2.add(new ArrayList<>());

        adj2.get(0).add(1);
        adj2.get(1).add(2);
        adj2.get(2).add(3);

        hasCycle = obj.check(V, adj2);
        System.out.println("Graph has cycle? " + hasCycle);
    }
}