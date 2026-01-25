package Graph.LeetCode;

import java.util.*;

public class StepsByKnight {

    static class Node {
        int x, y, dist;

        Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static int minStep(int n, int startX, int startY, int tarX, int tarY) {

        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

        boolean[][] visited = new boolean[n][n];
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(startX, startY, 0));
        visited[startX][startY] = true;

        while (!q.isEmpty()) {

            Node curr = q.poll();

            if (curr.x == tarX && curr.y == tarY) {
                return curr.dist;
            }

            for (int i = 0; i < 8; i++) {
                int newX = curr.x + dx[i];
                int newY = curr.y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < n
                        && !visited[newX][newY]) {

                    visited[newX][newY] = true;
                    q.add(new Node(newX, newY, curr.dist + 1));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minStep(8, 0, 0, 7, 7));
    }
}
