/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//delete a node when head is not provided
class Solution {
    public void deleteNode(ListNode node) {
        if (node==null||node.next==null){
            System.out.println("cannot delete");
        }
        node.val=node.next.val;
        node.next=node.next.next;
    }
}