class Node_CompareLists{
    int info;
    Node_CompareLists next;
}
class LinkedList_CompareLists {
    Node_CompareLists head1 = null;
    Node_CompareLists head2 = null;
    Node_CompareLists ptr;

    void createNode(int ele) {
        ptr = new Node_CompareLists();
        ptr.info = ele;
        ptr.next = null;
    }

    void insert_at_beginning1(int ele) {
        createNode(ele);
        if (head1 == null) {
            head1 = ptr;
        } else {
            ptr.next = head1;
            head1 = ptr;
        }
    }

    void insert_at_beginning2(int ele) {
        createNode(ele);
        if (head2 == null) {
            head2 = ptr;
        } else {
            ptr.next = head2;
            head2 = ptr;
        }
    }

    void check(){
        Node_CompareLists temp1=head1;
        Node_CompareLists temp2=head2;
        int check=1;
        while (temp1!=null && temp2!=null){
            if (temp1.info!=temp2.info){
                check=0;
                break;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if (temp1!=null || temp2!=null){
            check=0;
        }
        if (check==1){
            System.out.println("linked lists are equal");
        }
        else{
            System.out.println("unequal linked lists");
        }
    }

    void display(Node_CompareLists head){
        Node_CompareLists temp= head;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("-> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
public class CompareLists {
    public static void main(String[] args) {
        LinkedList_CompareLists l= new LinkedList_CompareLists();
        l.insert_at_beginning1(3);
        l.insert_at_beginning1(2);
        l.insert_at_beginning1(12);
        l.insert_at_beginning1(24);
        l.insert_at_beginning1(2);
        l.insert_at_beginning2(2);
        l.insert_at_beginning2(12);
        l.insert_at_beginning2(24);
        l.insert_at_beginning2(2);
        l.display(l.head1);
        l.display(l.head2);
        l.check();
    }
}
