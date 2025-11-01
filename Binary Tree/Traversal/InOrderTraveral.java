package Traversal;
import java.util.*;
class TreeNode_InorderTraversal{
    int val;
    TreeNode_InorderTraversal right;
    TreeNode_InorderTraversal left;
    TreeNode_InorderTraversal(int x){
        this.val=x;
        this.right=null;
        this.left=null;
    }
}
class Code_InorderTraversal{
    public List<Integer> InorderTraversal(TreeNode_InorderTraversal root){
        List<Integer> result= new ArrayList<>();
        Stack<TreeNode_InorderTraversal> stk= new Stack<>();
        TreeNode_InorderTraversal current=root;
        while (current!=null||!stk.isEmpty()){
            while (current!=null){
                stk.push(current);
                current=current.left;
            }
            current=stk.pop();
            result.add(current.val);
            current=current.right;
        }
        return result;
    }
}
public class InOrderTraveral {
    public static void main(String[] args) {
        TreeNode_InorderTraversal root=new TreeNode_InorderTraversal(1);
        root.right=new TreeNode_InorderTraversal(7);
        root.left=new TreeNode_InorderTraversal(6);
        Code_InorderTraversal ob= new Code_InorderTraversal();
        List<Integer> inorder= ob.InorderTraversal(root);
        System.out.println(inorder);
    }
}
