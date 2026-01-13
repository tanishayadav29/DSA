package Graph.LeetCode;

import java.util.*;

class leetcode_841 {

    public static void main(String[] args) {
        leetcode_841 obj = new leetcode_841();

        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));        // room 0
        rooms.add(Arrays.asList(2));        // room 1
        rooms.add(Arrays.asList(3));        // room 2
        rooms.add(new ArrayList<>());       // room 3

        System.out.println(obj.canVisitAllRooms(rooms)); // true
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int room = q.poll();
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    q.offer(key);
                }
            }
        }

        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }
}
