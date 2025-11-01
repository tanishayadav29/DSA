package Traversal;
import java.util.*;
class TreeNode_PreorderTraversal{
    int val;
    TreeNode_PreorderTraversal left;
    TreeNode_PreorderTraversal right;
    TreeNode_PreorderTraversal (int x){
        this.val=x;
        this.left=null;
        this.right=null;
    }
}
class code_TreeNodePreOrderTraversal {
    public List<Integer> preOrderTraversal(TreeNode_PreorderTraversal root){
        if (root==null){
            return new ArrayList<>();
        }
        Stack <TreeNode_PreorderTraversal> stack= new Stack<>();
        List <Integer> result= new ArrayList<>();
        TreeNode_PreorderTraversal current= root;
        while (current!=null||!stack.isEmpty()){
            if (current!=null){
                result.add(current.val);
                stack.push(current);
                current=current.left;
            }
            else{
                current=stack.pop();
                current=current.right;
            }
        }
        return result;
    }
}
public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode_PreorderTraversal root= new TreeNode_PreorderTraversal(5);
        root.right= new TreeNode_PreorderTraversal(6);
        root.left=new TreeNode_PreorderTraversal(7);
        code_TreeNodePreOrderTraversal traversal= new code_TreeNodePreOrderTraversal();
        List<Integer> preorder= traversal.preOrderTraversal(root);
        System.out.println(preorder);
    }
}
