package Stack;
class Node_linkedList_implementation{
    int info;
    Node_linkedList_implementation next;
}
class LL_implementation{
    Node_linkedList_implementation top= null;
    Node_linkedList_implementation ptr;
    void createNode (int ele){
        ptr= new Node_linkedList_implementation();
        ptr.info=ele;
        ptr.next=null;
    }
    void push(int ele){
        createNode(ele);
        if (top==null){
            top=ptr;
        }
        else{
            ptr.next=top;
            top=ptr;
        }
    }
    void pop(){
        if (top==null){
            System.out.println("EMPTY STACK!!!");
        }
        else{
            top=top.next;
        }
    }
    void peek(){
        Node_linkedList_implementation temp=top;
        while(temp!=null){
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
        l.push(4);
        l.push(34);
        l.push(45);
        l.push(48);
        l.push(42);
        l.push(412);
        l.push(44);
        l.push(40);
        l.peek();
        l.pop();
    }
}
