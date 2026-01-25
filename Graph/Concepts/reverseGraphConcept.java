package Graph.Concepts;
import java.util.*;

public class reverseGraphConcept {

    List<Integer> findSafeState(int[][] graph) {

        int n = graph.length;

        List<List<Integer>> reverse = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            reverse.add(new ArrayList<>());
        }

        int[] outdegree = new int[n];
       

        for (int u = 0; u < n; u++) {
            outdegree[u] = graph[u].length;
            for (int v : graph[u]) {
                reverse.get(v).add(u);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (outdegree[i] == 0) {
                q.offer(i);
            }
        }

        boolean[] safe = new boolean[n];   
        
        while (!q.isEmpty()) {
            int node = q.poll();
            safe[node] = true;

            for (int prev : reverse.get(node)) {
                outdegree[prev]--;
                if (outdegree[prev] == 0) {
                    q.offer(prev);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                result.add(i);   
            }
        }

        return result;
    }

    public static void main(String[] args) {
        reverseGraphConcept obj = new reverseGraphConcept();

        int[][] graph = {
            {1, 2},
            {2, 3},
            {5},
            {0},
            {5},
            {},
            {}
        };

        System.out.println(obj.findSafeState(graph));
    }
}
