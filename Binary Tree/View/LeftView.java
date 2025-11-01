package View;
import java.util.*;
class TreeNode_LeftView{
    int val;
    TreeNode_LeftView right;
    TreeNode_LeftView left;
    TreeNode_LeftView(int x){
        val=x;
        right=null;
        left=null;
    }
}
class code_LeftView{
    public List<Integer> function(TreeNode_LeftView root){
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> result1= new ArrayList<>();
        if (root==null){
            return result1;
        }
        Queue <TreeNode_LeftView> queue= new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size= queue.size();
            List<Integer> level= new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode_LeftView curr=queue.poll();
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
                result1.add(ele);
                break;
            }
        }
        return result1;
    }

}
public class LeftView {
    public static void main(String[] args) {
        TreeNode_LeftView root = new TreeNode_LeftView(5);
        root.right=new TreeNode_LeftView(7);
        root.left= new TreeNode_LeftView(6);
        root.left.right= new TreeNode_LeftView(9);
        root.left.left= new TreeNode_LeftView(1);
        root.right.right= new TreeNode_LeftView(2);
        code_LeftView obj= new code_LeftView();
        List<Integer> ans= obj.function(root);
        System.out.println(ans);
    }
}
