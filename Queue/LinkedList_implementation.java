package Queue;
class Node_LinkedList_implementation{
    int info;
    Node_LinkedList_implementation next;
}
class LL_implementation{
    Node_LinkedList_implementation front=null;
    Node_LinkedList_implementation rear=null;
    Node_LinkedList_implementation ptr;
    void createNode(int ele){
        ptr=new Node_LinkedList_implementation();
        ptr.info=ele;
        ptr.next=null;
    }
    void enqueue(int ele){
        createNode(ele);
        if (rear==null){
            front=ptr;
            rear=ptr;
        }
        else{
            rear.next=ptr;
            rear=ptr;
        }
    }
    void dequeue(){
        if (rear==null){
            System.out.println("EMPTY QUEUE!!");
        }
        else{
            front=front.next;
        }
    }
    void peek(){
        Node_LinkedList_implementation temp=front;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println();
    }
}
public class LinkedList_implementation {
    public static void main(String[] args) {
        LL_implementation l=new LL_implementation();
        l.enqueue(2);
        l.enqueue(5);
        l.enqueue(5);
        l.enqueue(7);
        l.enqueue(9);
        l.peek();
        l.dequeue();
        l.peek();
    }
}
