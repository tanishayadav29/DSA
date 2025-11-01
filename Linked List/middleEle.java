class Node_middleEle{
    int val;
    Node_middleEle next;
}
class LinkedList_middleEle{
    Node_middleEle head= null;
    Node_middleEle ptr;
    void createNode(int ele){
        ptr=new Node_middleEle();
        ptr.val=ele;
        ptr.next=null;
    }
    void insert_at_beginning( int ele){
        createNode(ele);
        if (head==null){
            head=ptr;
        }
        else{
            ptr.next=head;
            head=ptr;
        }
    }
    Node_middleEle middleELE(){
        Node_middleEle fast=head;
        Node_middleEle slow= head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.val);
        return slow;
    }
}
public class middleEle {
    public static void main(String[] args) {
        LinkedList_middleEle l= new LinkedList_middleEle();
        l.insert_at_beginning(3);
        l.insert_at_beginning(4);
        l.insert_at_beginning(46);
        l.insert_at_beginning(29);
        l.insert_at_beginning(42);
        l.insert_at_beginning(14);
        l.insert_at_beginning(1);
        l.insert_at_beginning(3);
        System.out.println(l.middleELE());
    }
}
