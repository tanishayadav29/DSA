class Node_cycleDetection{
    int info;
    Node_cycleDetection next;
}
class LinkedList_cycleDetection{
    Node_cycleDetection start=null;
    Node_cycleDetection ptr;
    void createNode(int ele){
        ptr= new Node_cycleDetection();
        ptr.info=ele;
        ptr.next=null;
    }
    void insert_at_beginning( int ele){
        createNode(ele);
        if (start==null){
            start=ptr;
        }
        else{
            ptr.next=start;
            start=ptr;
        }
    }
    boolean cycleDetect(){
        Node_cycleDetection fast= start;
        Node_cycleDetection slow= start;
        if (start==null||start.next==null){
            return false;
        }
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }
    //find start point of the cycle
    Node_cycleDetection cycleBeg(){
        if (start==null||start.next==null){
            return null;
        }
        Node_cycleDetection fast = start;
        Node_cycleDetection slow= start;
        while (fast!=null||fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                Node_cycleDetection x=slow;
                Node_cycleDetection y=start;
                while (x!=y){
                    x=x.next;
                    y=y.next;
                }
                return x;
            }
        }
        return null;
    }
}
public class cycleDetection {
    public static void main(String[] args) {
        LinkedList_cycleDetection L = new LinkedList_cycleDetection();
    }
}
