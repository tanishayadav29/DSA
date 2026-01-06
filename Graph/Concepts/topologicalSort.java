package Graph.Concepts;
import java.util.*;

public class topologicalSort {
    int [] toposort(int v, ArrayList<ArrayList<Integer>> adj){
        boolean visited[]= new boolean [v];
        Stack <Integer> stk= new Stack<>();
        for ( int i=0; i<v;i++){
            if (!visited[i]){
                dfs(i,visited,adj,stk);
            }
        }
        int [] topo= new int[v];
        int index=0;
        while(!stk.isEmpty())
        {
            topo[index++]=stk.pop();
        }
        return topo;
    }

    void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stk){

        visited[node]=true;
        for(int neigh:adj.get(node)){
            if(!visited[neigh]){
                dfs(neigh, visited, adj, stk);

            }
        }
        stk.push(node);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        topologicalSort obj = new topologicalSort();
        int[] topo = obj.toposort(V, adj);

        System.out.println("Topological Order:");
        for (int x : topo) {
            System.out.print(x + " ");
        }
    }
}
