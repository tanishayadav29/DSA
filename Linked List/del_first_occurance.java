//program to delete the first occurance of a node with value x.

class Node_del_first_occurance{
    int info;
    Node_del_first_occurance next;
}
class linkedlist_del_first_occcurance{
    Node_del_first_occurance head= null;
    Node_del_first_occurance ptr;
    //creating a function to put info and node pointer
    void createNode(int ele){
        ptr= new Node_del_first_occurance();
        ptr.info=ele;
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

    void solve(int x){
        if (head==null){
            System.out.println("empty list");
            return;
        }
        if (head.info==x){
            head=head.next;
        }
        else{
            Node_del_first_occurance temp=head;
            while (temp.next!=null){
                if (temp.next.info==x){
                    temp.next=temp.next.next;
                    break;
                }
                temp=temp.next;
            }
        }
    }
    void display(){
        Node_del_first_occurance temp= head;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("-> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
public class del_first_occurance {
    public static void main(String[] args) {
        linkedlist_del_first_occcurance l= new linkedlist_del_first_occcurance();
        l.insert_at_beginning(1);
        l.insert_at_beginning(6);
        l.insert_at_beginning(6);
        l.display();
        l.solve(2);
        l.display();
        l.solve(6);
        l.display();
    }
}
