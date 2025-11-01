import java.util.Scanner;
class Node_deletion{
    int info;
    Node_deletion next;
}
class LinkedList_deletion{
    Node_deletion start= null;
    Node_deletion ptr;
    void createNode(int ele){
        ptr= new Node_deletion();
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
    void delete_at_beginning(){
        if (start==null){
            System.out.println("Empty! Nothing to delete.");
            return;
        }
        start=start.next;
    }
    void delete_at_end(){
        if (start == null){
            System.out.println("Empty! Nothing to delete.");
            return;
        }
        if (start.next == null){
            start = null;
            return;
        }
        Node_deletion temp = start;
        while (temp.next.next != null){  // STOP 1 before last
            temp = temp.next;
        }
        temp.next = null;
    }
    void delete_at_position (int pos){
        if(start== null){
            System.out.println("empty list! nothing to delete");
            return;
        }
        if (pos<1){
            System.out.println("invalid position entered");
            return;
        }
        if (pos==1){
            start=start.next;
            return;
        }
        Node_deletion temp= start;
        for (int i=1; i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if (temp == null || temp.next == null){
            System.out.println("Position out of bounds.");
            return;
        }
        temp.next=temp.next.next;
    }
    void display(){
        Node_deletion temp= start;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("-> ");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
}
public class Deletion {
    public static void main(String[] args) {
        LinkedList_deletion L = new LinkedList_deletion();
        Scanner sc= new Scanner(System.in);
        int element;
        System.out.println("Firstly, create a linked list.");
        while (true){
            System.out.println("enter element into linked list:");
            element= sc.nextInt();
            L.insert_at_beginning(element);
            System.out.println("Enter 0 if you wish to stop putting elements in linked list:");
            int ques= sc.nextInt();
            if (ques==0){
                System.out.println("displaying your current linked list:");
                L.display();
                break;
            }
        }
        System.out.println();
        System.out.println("MENU \n Enter 1 to delete at beginning \n Enter 2 to delete at end \n Enter 3 to delete at a given position");
        while (true){
            System.out.println("Enter your choice according to MENU:");
            int choice= sc.nextInt();
            if (choice==1){
                while (true){
                    System.out.println("Deleting element at beginning....");
                    L.delete_at_beginning();
                    System.out.println("Enter 0 if you wish to stop deleting elements from linked list:");
                    int ques= sc.nextInt();
                    if (ques==0){
                        System.out.println("displaying your current linked list:");
                        System.out.println("elements are deleted from beginning:");
                        L.display();
                        break;
                    }
                }
            }
            else if (choice==2){
                while (true){
                    System.out.println("Deleting element from end....");
                    L.delete_at_end();
                    System.out.println("Enter 0 if you wish to stop deleting elements in linked list:");
                    int ques= sc.nextInt();
                    if (ques==0){
                        System.out.println("displaying your current linked list:");
                        System.out.println("elements are deleted from end:");
                        L.display();
                        break;
                    }
                }
            }
            else if (choice==3){
                while (true){
                    System.out.println("enter the position at which you wish to delete the element");
                    int position= sc.nextInt();
                    L.delete_at_position(position);
                    System.out.println("Enter 0 if you wish to stop deleting elements in linked list:");
                    int ques= sc.nextInt();
                    if (ques==0){
                        System.out.println("displaying your current linked list:");
                        System.out.println("elements are added from end:");
                        L.display();
                        break;
                    }
                }
            }
            else{
                System.out.println("Invalid choice!");
            }
            System.out.println("enter 0 if you wish to exit the deletion program.");
            int question= sc.nextInt();
            if (question==0){
                System.out.println("Your final linked list:");
                L.display();
                System.out.println();
                System.out.println("EXITING...");
                break;
            }
        }
        sc.close();
    }
}
