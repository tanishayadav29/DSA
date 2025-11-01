class Node_insertion{
    int info;
    Node_insertion next;
    Node_insertion prev;
}
class Linkedlist_insertion{
    Node_insertion head=null;
    Node_insertion ptr;
    void CreateNode(int ele){
        ptr= new Node_insertion();
        ptr.info=ele;
        ptr.next=null;
        ptr.prev=null;
    }
    void insert_at_beg(int ele){
        CreateNode(ele);
        if (head==null){
            head=ptr;
        }
        else{
            head.prev=ptr;
            ptr.next=head;
            head=ptr;
        }
    }
    void insert_at_end(int ele){
        CreateNode(ele);
        if (head==null){
            head=ptr;
        }
        else{
            Node_insertion temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=ptr;
            ptr.prev=temp;
        }
    }
    void insert_at_pos(int ele,int pos){
        CreateNode(ele);
        if (pos<1){
            System.out.println("INVALID POSITION!");
        }
        else if (pos==1){
            head.prev=ptr;
            ptr.next=head;
            head=ptr;
        }
        else{
            Node_insertion temp=head;
            for(int i=1;i<pos-1&&temp!=null;i++){
                temp=temp.next;
            }
            ptr.next=temp.next;
            ptr.prev=temp;
            temp.next.prev=ptr;
            temp.next=ptr;
        }
    }
    void display(){
        Node_insertion temp=head;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
public class Insertion {
    public static void main(String[] args) {
        Linkedlist_insertion l=new Linkedlist_insertion();
        l.insert_at_beg(3);
        l.insert_at_beg(4);
        l.insert_at_beg(45);
        l.insert_at_end(34);
        l.insert_at_pos(1,2);
        l.display();
    }
}
