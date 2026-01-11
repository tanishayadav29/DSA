package LeetCode;

import java.util.*;

public class leetcode_1161 {

    // TreeNode renamed
    static class leetcode_1161_treenode {
        int val;
        leetcode_1161_treenode left, right;

        leetcode_1161_treenode(int val) {
            this.val = val;
        }

        leetcode_1161_treenode(int val,
                               leetcode_1161_treenode left,
                               leetcode_1161_treenode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // function
    public static int maxLevelSum(leetcode_1161_treenode root) {
        Queue<leetcode_1161_treenode> q = new LinkedList<>();
        q.offer(root);

        int level = 1;
        int ansLevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                leetcode_1161_treenode node = q.poll();
                sum += node.val;

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                ansLevel = level;
            }

            level++;
        }

        return ansLevel;
    }

    // main method
    public static void main(String[] args) {

        /*
            Tree:
                    1
                   / \
                  7   0
                 / \
                7  -8
        */
        leetcode_1161_treenode root = new leetcode_1161_treenode(
            1,
            new leetcode_1161_treenode(7,
                new leetcode_1161_treenode(7),
                new leetcode_1161_treenode(-8)
            ),
            new leetcode_1161_treenode(0)
        );

        System.out.println(maxLevelSum(root));
    }
}
