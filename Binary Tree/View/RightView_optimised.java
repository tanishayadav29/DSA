package View;
import java.util.*;
class TreeNode_RightView2{
    int val;
    TreeNode_RightView2 right;
    TreeNode_RightView2 left;
    TreeNode_RightView2(int x){
        val=x;
        right=null;
        left=null;
    }
}
class code_RightView2{
    public List<Integer> levelOrder(TreeNode_RightView2 root){
        List<Integer> result= new ArrayList<>();
        if (root==null){
            return result;
        }
        LinkedList<TreeNode_RightView2> queue= new LinkedList<>();
        queue.offer(root);
        TreeNode_RightView2 last= root;
        while (!queue.isEmpty()){
            TreeNode_RightView2 current= queue.poll();
            if (current.left!=null){
                queue.offer(current.left);
            }
            if (current.right!=null){
                queue.offer(current.right);
            }
            if (current==last){
                result.add(last.val);
                if (!queue.isEmpty()){
                    last=queue.peekLast();
                }
            }
        }
        return result;
    }

}
public class RightView_optimised {
    public static void main(String[] args) {
        TreeNode_RightView2 root = new TreeNode_RightView2(5);
        root.right=new TreeNode_RightView2(7);
        root.left= new TreeNode_RightView2(6);
        root.left.right= new TreeNode_RightView2(9);
        root.left.left= new TreeNode_RightView2(1);
        root.right.right= new TreeNode_RightView2(2);
        code_RightView2 obj= new code_RightView2();
        List<Integer> ans= obj.levelOrder(root);
        System.out.println(ans);
    }
}
