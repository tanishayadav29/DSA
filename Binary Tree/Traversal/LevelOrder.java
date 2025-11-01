package Traversal;
import java.util.*;
class TreeNode_levelorder{
    int val;
    TreeNode_levelorder right;
    TreeNode_levelorder left;
    TreeNode_levelorder(int x){
        val=x;
        right=null;
        left=null;
    }
}
class code_LevelorderTraversal{
    public List<List<Integer>> LevelOrderTraversal(TreeNode_levelorder root){
        List<List<Integer>> result= new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue <TreeNode_levelorder> queue= new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size= queue.size();
            List<Integer> level= new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode_levelorder curr=queue.poll();
                if (curr!=null){
                    level.add(curr.val);
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            if (!level.isEmpty()){
                result.add(level);
            }
        }
        return result;
    }

}
public class LevelOrder {
    public static void main(String[] args) {
        TreeNode_levelorder root = new TreeNode_levelorder(5);
        root.right=new TreeNode_levelorder(7);
        root.left= new TreeNode_levelorder(6);
        root.left.right= new TreeNode_levelorder(9);
        root.left.left= new TreeNode_levelorder(1);
        root.right.right= new TreeNode_levelorder(2);
        code_LevelorderTraversal obj= new code_LevelorderTraversal();
        List<List<Integer>> levelorder= obj.LevelOrderTraversal(root);
        System.out.println(levelorder);
    }
}
