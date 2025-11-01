
class Node_deletion{
    int info;
    Node_deletion next;
    Node_deletion prev;
}
class linkedlist_deletion{
    Node_deletion head=null;
    Node_deletion ptr;
    void CreateNode(int ele){
        ptr= new Node_deletion();
        ptr.info=ele;
        ptr.next=null;
        ptr.prev=null;
    }
    void insert_at_end(int ele){
        CreateNode(ele);
        if (head==null){
            head=ptr;
        }
        else{
            Node_deletion temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=ptr;
            ptr.prev=temp;
        }
    }
    void delete_at_beg(){
        if (head==null){
            System.out.println("list is empty!");
        }
        else{
            head.next.prev=null;
            head=head.next;
        }
    }
    void delete_at_end(){
        if (head==null){
            System.out.println("empty list");
        }
        else{
            Node_deletion temp= head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next.prev=null;
            temp.next=null;
        }
    }
    void delete_at_pos(int pos){
        if (head==null){
            System.out.println("empty list1");
        }
        if (pos<1){
            System.out.println("invalid position");
        }
        else if (pos==1){
            head.next.prev=null;
            head=head.next;
        }
        else {
            Node_deletion temp=head;
            for (int i=1;i<pos-1&&temp!=null;i++){
                temp=temp.next;
            }
            temp.next.next.prev=temp;
            temp.next=temp.next.next;
        }
    }
    void display(){
        Node_deletion temp=head;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
public class deletion {
    public static void main(String[] args) {
        linkedlist_deletion l=new linkedlist_deletion();
        l.insert_at_end(3);
        l.insert_at_end(4);
        l.insert_at_end(102);
        l.insert_at_end(12);
        l.display();
        l.delete_at_pos(2);
        l.display();
        l.delete_at_end();
        l.display();

    }
}
