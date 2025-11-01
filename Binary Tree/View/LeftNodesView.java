package View;
import java.util.*;
class TreeNode_LeftNodesView{
    int val;
    TreeNode_LeftNodesView left;
    TreeNode_LeftNodesView right;
    TreeNode_LeftNodesView(int x){
        val=x;
        left=null;
        right=null;
    }
}
class code_LeftNodesView{
    static class Pair{
        TreeNode_LeftNodesView node;
        boolean isLeft;
        Pair(TreeNode_LeftNodesView node, boolean isLeft){
            this.node=node;
            this.isLeft=isLeft;
        }
    }
    public List<Integer> function(TreeNode_LeftNodesView root){
        List<Integer> result= new ArrayList<>();
        if (root==null){
            return result;
        }
        Stack <Pair> stack= new Stack<>();
        stack.push(new Pair(root,true));
        while (!stack.isEmpty()){
            Pair current= stack.pop();
            TreeNode_LeftNodesView node= current.node;
            boolean isLeft= current.isLeft;
            if (node==null){
                continue;
            }
            if (isLeft){
                result.add(node.val);
            }
            stack.push( new Pair(node.right,false));
            stack.push( new Pair(node.left,true));

        }
        return result;
    }
}
public class LeftNodesView {
    public static void main(String[] args){
        TreeNode_LeftNodesView root= new TreeNode_LeftNodesView(29);
        root.right= new TreeNode_LeftNodesView(0);
        root.left= new TreeNode_LeftNodesView(34);
        root.left.left= new TreeNode_LeftNodesView(12);
        root.left.right= new TreeNode_LeftNodesView(56);
        root.right.right= new TreeNode_LeftNodesView(45);
        root.right.left= new TreeNode_LeftNodesView(89);
        code_LeftNodesView obj= new code_LeftNodesView();
        List<Integer> ans= obj.function(root);
        System.out.println(ans);
    }
}
