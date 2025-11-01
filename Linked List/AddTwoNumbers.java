/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null && l2==null){
            return null;
        }
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode x = l1;
        ListNode y= l2;
        int v1;
        int v2;
        int carry=0;
        ListNode result= new ListNode(0);
        ListNode current= result;
        while (x!=null || y!=null || carry!=0){
            if (x!=null){
                v1=x.val;
            }
            else{
                v1=0;
            }
            if (y!=null){
                v2=y.val;
            }
            else{
                v2=0;
            }
            int sum= v1+v2+carry;
            int value=sum%10;
            carry=sum/10;
            ListNode new_node= new ListNode(value);
            current.next=new_node;
            current=current.next;

            if (x!=null){
                x=x.next;
            }
            if (y!=null){
                y=y.next;
            }
        }
        return result.next;
    }
}

