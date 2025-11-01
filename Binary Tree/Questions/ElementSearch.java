package Questions;
import java.util.*;
class TreeNode_ElementSearch{
    int val;
    TreeNode_ElementSearch right;
    TreeNode_ElementSearch left;
    TreeNode_ElementSearch(int x){
        this.val=x;
        this.right=null;
        this.left=null;
    }
}
class Code_ElementSearch{
    public boolean search(TreeNode_ElementSearch root,int ele){
        Stack<TreeNode_ElementSearch> stk= new Stack<>();
        TreeNode_ElementSearch current=root;
        while (current!=null||!stk.isEmpty()){
            while (current!=null){
                stk.push(current);
                current=current.left;
            }
            current=stk.pop();
            if (current.val==ele){
                return true;
            }
            current=current.right;
        }
        return false;
    }
}
public class ElementSearch {
    public static void main(String[] args) {
        TreeNode_ElementSearch root=new TreeNode_ElementSearch(1);
        root.right=new TreeNode_ElementSearch(7);
        root.left=new TreeNode_ElementSearch(6);
        Code_ElementSearch ob= new Code_ElementSearch();
        if (ob.search(root,5)){
            System.out.println("element is present in tree");
        }
        else{
            System.out.println("element not present in tree");
        }
    }
}
