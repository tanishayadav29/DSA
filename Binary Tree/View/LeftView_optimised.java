package View;
import java.util.*;

class TreeNode_LeftView2 {
    int val;
    TreeNode_LeftView2 left;
    TreeNode_LeftView2 right;
    
    TreeNode_LeftView2(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class code_LeftView2 {
    public List<Integer> levelOrder(TreeNode_LeftView2 root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedList<TreeNode_LeftView2> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size(); // nodes at current level

            for (int i = 0; i < size; i++) {
                TreeNode_LeftView2 current = queue.poll();

                // Add the first node of this level
                if (i == 0) {
                    result.add(current.val);
                }

                // Traverse left first
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return result;
    }
}

public class LeftView_optimised {
    public static void main(String[] args) {
        TreeNode_LeftView2 root = new TreeNode_LeftView2(5);
        root.right = new TreeNode_LeftView2(7);
        root.left = new TreeNode_LeftView2(6);
        root.left.right = new TreeNode_LeftView2(9);
        root.left.left = new TreeNode_LeftView2(1);
        root.right.right = new TreeNode_LeftView2(2);

        code_LeftView2 obj = new code_LeftView2();
        List<Integer> ans = obj.levelOrder(root);
        System.out.println(ans);  // Output: Left view of the tree
    }
}
