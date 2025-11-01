//make a new linked list from an existing linked list but it should only contain prime numbers from the existing one
class Node_Q1{
    int info;
    Node_Q1 next;
}
class LinkedList_Q1{
    //declaring the head for both linked lists.
    Node_Q1 head1= null;
    Node_Q1 head2= null;
    Node_Q1 ptr;
    //creating a function to put info and node pointer
    void createNode(int ele){
        ptr= new Node_Q1();
        ptr.info=ele;
        ptr.next=null;
    }
    //this insert is used to a normal linked list
    void insert_at_beginning( int ele){
        createNode(ele);
        if (head1==null){
            head1=ptr;
        }
        else{
            ptr.next=head1;
            head1=ptr;
        }
    }
    //this insert is insert only prime numbers in new linked list
    void insert_at_end( int ele){
        createNode(ele);
        Node_Q1 temp= head2;
        if (head2==null){
            head2=ptr;
        }
        else{
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=ptr;
        }
    }
    boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
       return true;
    }
    void create_primeL(){
        Node_Q1 temp= head1;
        while (temp!=null){
            if (isPrime(temp.info)){
                insert_at_end(temp.info);
            }
            temp=temp.next;
        }
    }
    void display(Node_Q1 head){
        Node_Q1 temp= head;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("-> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
public class Q1 {
    public static void main(String[] args) {
        LinkedList_Q1 l= new LinkedList_Q1();
        l.insert_at_beginning(3);
        l.insert_at_beginning(7);
        l.insert_at_beginning(9);
        l.insert_at_beginning(4);
        l.insert_at_beginning(2);
        l.insert_at_beginning(12);
        l.insert_at_beginning(11);
        l.insert_at_beginning(31);
        l.create_primeL();
        System.out.println("original linked list is:");
        l.display(l.head1);
        System.out.println("new linked list:");
        l.display(l.head2);
    }
}
