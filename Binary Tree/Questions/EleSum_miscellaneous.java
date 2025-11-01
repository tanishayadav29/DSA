//PROGRAM TO FIND THE SUM OF THE ELEMENT WHICH ARE DIVISIBLE BY 7 IN A TREE
package Questions;
import java.util.*;
class TreeNode_EleSum_miscellaneous{
    int val;
    TreeNode_EleSum_miscellaneous right;
    TreeNode_EleSum_miscellaneous left;
    TreeNode_EleSum_miscellaneous(int x){
        this.val=x;
        this.right=null;
        this.left=null;
    }
}
class Code_EleSum_miscellaneous{
    public int search(TreeNode_EleSum_miscellaneous root){
        int sum=0;
        Stack<TreeNode_EleSum_miscellaneous> stk= new Stack<>();
        TreeNode_EleSum_miscellaneous current=root;
        while (current!=null||!stk.isEmpty()){
            while (current!=null){
                stk.push(current);
                current=current.left;
            }
            current=stk.pop();
            if (current.val%7==0){
                sum+=current.val;
            }
            current=current.right;
        }
        return sum;
    }
}
public class EleSum_miscellaneous {
    public static void main(String[] args) {
        TreeNode_EleSum_miscellaneous root=new TreeNode_EleSum_miscellaneous(1);
        root.right=new TreeNode_EleSum_miscellaneous(7);
        root.left=new TreeNode_EleSum_miscellaneous(6);
        Code_EleSum_miscellaneous ob= new Code_EleSum_miscellaneous();
        System.out.println("sum of elements divisible by 7 present in tree is: "+ob.search(root));
    }
}
