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
    public boolean Palindrome_LinkedList(ListNode head) {
        if (head==null||head.next==null){
            return true;
        }
        ListNode fast= head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode curr= slow;
        ListNode prev=null;
        ListNode node=null;
        while (curr!=null){
            node=curr.next;
            curr.next=prev;
            prev=curr;
            curr=node;
        }
        ListNode SecondHalf= prev;
        ListNode FirstHalf= head;
        while (SecondHalf!=null){
            if (FirstHalf.val!=SecondHalf.val){
                return false;
            }
            FirstHalf=FirstHalf.next;
            SecondHalf=SecondHalf.next;
        }
        return true;
    }
}

