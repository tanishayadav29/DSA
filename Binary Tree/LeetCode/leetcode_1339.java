package LeetCode;



public class leetcode_1339 {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    long totalSum = 0;
    long maxProduct = 0;
    int MOD = 1000000007;

    public int maxProduct(TreeNode root) {
        totalSum = solve(root);
        dfs(root);
        return (int)(maxProduct % MOD);
    }

    private long solve(TreeNode node) {
        if (node == null) return 0;
        return node.val + solve(node.left) + solve(node.right);
    }

    private long dfs(TreeNode node) {
        if (node == null) return 0;

        long leftSum = dfs(node.left);
        long rightSum = dfs(node.right);

        long subtreeSum = node.val + leftSum + rightSum;
        long product = subtreeSum * (totalSum - subtreeSum);

        maxProduct = Math.max(maxProduct, product);
        return subtreeSum;
    }

    // main method
    public static void main(String[] args) {

        leetcode_1339 obj = new leetcode_1339();

        /*
            Tree:
                    1
                   / \
                  2   3
                 / \   \
                4   5   6
        */
        TreeNode root = new TreeNode(
            1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3, null, new TreeNode(6))
        );

        System.out.println(obj.maxProduct(root));
    }
}
