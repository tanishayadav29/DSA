package View;
import java.util.*;
class TreeNode_RightView{
    int val;
    TreeNode_RightView right;
    TreeNode_RightView left;
    TreeNode_RightView(int x){
        val=x;
        right=null;
        left=null;
    }
}
class code_RightView{
    public List<Integer> levelOrder(TreeNode_RightView root){
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> result1= new ArrayList<>();
        int ans=0;
        if (root==null){
            return result1;
        }
        Queue <TreeNode_RightView> queue= new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size= queue.size();
            List<Integer> level= new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode_RightView curr=queue.poll();
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
        for (List<Integer> fruit : result) {
            for (int ele: fruit){
                ans=ele;
            }
            result1.add(ans);
        }
        return result1;
    }

}
public class RightView {
    public static void main(String[] args) {
        TreeNode_RightView root = new TreeNode_RightView(5);
        root.right=new TreeNode_RightView(7);
        root.left= new TreeNode_RightView(6);
        root.left.right= new TreeNode_RightView(9);
        root.left.left= new TreeNode_RightView(1);
        root.right.right= new TreeNode_RightView(2);
        code_RightView obj= new code_RightView();
        List<Integer> levelorder= obj.levelOrder(root);
        System.out.println(levelorder);
    }
}
