class Node_swap{
    int info;
    Node_swap next;
}
class LinkedList_swapPair {
    Node_swap start = null;
    Node_swap ptr;

    void createNode(int ele) {
        ptr = new Node_swap();
        ptr.info = ele;
        ptr.next = null;
    }

    void insert_at_beginning(int ele) {
        createNode(ele);
        if (start == null) {
            start = ptr;
        } else {
            ptr.next = start;
            start = ptr;
        }
    }
    Node_swap swapPair(){
        if (start==null){
            return null;
        }
        if (start.next==null){
            return start;
        }
        Node_swap prev=null;
        Node_swap x= start;
        Node_swap y= start.next;
        while (x!=null && y!=null) {
            x.next= y.next;
            y.next=x;
            if (prev==null){
                start=y;
            }
            else{
                prev.next=y;
            }
            prev=x;
            x=x.next;
            if (x==null){
                break;
            }
            y=y.next;
        }
        return start;
    }
    void display(){
        Node_swap temp= start;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("-> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
public class swap {
    public static void main(String[] args) {
        LinkedList_swapPair l= new LinkedList_swapPair();
        l.insert_at_beginning(5);
        l.insert_at_beginning(7);
        l.insert_at_beginning(8);
        l.insert_at_beginning(9);
        l.insert_at_beginning(0);
        l.insert_at_beginning(3);
        l.display();
        System.out.println(l.swapPair());
        l.display();
    }
}
