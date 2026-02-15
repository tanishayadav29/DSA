package Graph.LeetCode;

import java.util.*;

public class leetcode_1376 {

    int maxTime = 0;

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        // edge case
        if (n == 0)
            return 0;

        // build tree
        Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n; i++) {
            tree.put(i, new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                tree.get(manager[i]).add(i);
            }
        }

        // dfs
        dfs(headID, 0, tree, informTime);

        return maxTime;
    }

    private void dfs(int node, int currentTime, Map<Integer, List<Integer>> tree, int[] informTime) {
        maxTime = Math.max(maxTime, currentTime);

        for (int child : tree.get(node)) {
            dfs(child, currentTime + informTime[node], tree, informTime);
        }
    }

    // 🔥 main method
    public static void main(String[] args) {
        leetcode_1376 obj = new leetcode_1376();

        // sample input
        int n = 6;
        int headID = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};

        int result = obj.numOfMinutes(n, headID, manager, informTime);
        System.out.println("Minimum time needed: " + result);
    }
}
