package Traversal;
import java.util.*;
class TreeNode_PostorderTraversal{
    int val;
    TreeNode_PostorderTraversal left;
    TreeNode_PostorderTraversal right;
    TreeNode_PostorderTraversal (int x){
        this.val=x;
        this.left=null;
        this.right=null;
    }
}
class code_TreeNodePostOrderTraversal{
    public List<Integer> postOrderTraversal(TreeNode_PostorderTraversal root){
        if (root==null){
            return new ArrayList<>();
        }
        Stack <TreeNode_PostorderTraversal> stack= new Stack<>();
        LinkedList <Integer> result= new LinkedList<>();
        TreeNode_PostorderTraversal current= root;
        while (current!=null||!stack.isEmpty()){
            if (current!=null){
                stack.push(current);
                result.addFirst(current.val);
                current=current.right;
            }
            else{
                current=stack.pop();
                current=current.left;
            }
        }
        return result;
    }
}
public class PostorderTraversal {
    public static void main(String[] args) {
        TreeNode_PostorderTraversal root= new TreeNode_PostorderTraversal(5);
        root.right= new TreeNode_PostorderTraversal(6);
        root.left=new TreeNode_PostorderTraversal(7);
        code_TreeNodePostOrderTraversal traversal= new code_TreeNodePostOrderTraversal();
        List<Integer> postorder= traversal.postOrderTraversal(root);
        System.out.println(postorder);
    }
}
