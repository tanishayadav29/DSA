package Graph.LeetCode;

import java.util.*;

public class leetcode_207 {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph: bi -> ai
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] dfsVis = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfsCheck(i, graph, visited, dfsVis)) {
                    return false; // cycle found
                }
            }
        }
        return true; // no cycle
    }

    private static boolean dfsCheck(int node,
                                    ArrayList<ArrayList<Integer>> graph,
                                    boolean[] visited,
                                    boolean[] dfsVis) {

        visited[node] = true;
        dfsVis[node] = true;

        for (int neigh : graph.get(node)) {
            if (!visited[neigh]) {
                if (dfsCheck(neigh, graph, visited, dfsVis)) {
                    return true;
                }
            } else if (dfsVis[neigh]) {
                return true; // cycle detected
            }
        }

        dfsVis[node] = false; // backtrack
        return false;
    }

    public static void main(String[] args) {

        int numCourses = 4;
        int[][] prerequisites = {
            {1, 0},
            {2, 1},
            {3, 2}
        };

        boolean result = canFinish(numCourses, prerequisites);
        System.out.println("Can finish all courses: " + result);
    }
}
