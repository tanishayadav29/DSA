class Node_reverseLL {
    int info;
    Node_reverseLL next;
}

class LinkedList_reverse__LL {
    Node_reverseLL start = null;
    Node_reverseLL ptr;

    void createNode(int ele) {
        ptr = new Node_reverseLL();
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

    void reverse() {
        System.out.println("before reversing");
        display();

        Node_reverseLL current = start;
        Node_reverseLL prev = null;
        Node_reverseLL my_ptr = null;

        while (current != null) {
            my_ptr = current.next;
            current.next = prev;
            prev = current;
            current = my_ptr;
        }

        start = prev;
        System.out.println("after reversing");
        display();
    }

    void display() {
        Node_reverseLL temp = start;
        while (temp != null) {
            System.out.print(temp.info);
            System.out.print("-> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

public class reverse_LL {
    public static void main(String[] args) {
        LinkedList_reverse__LL L = new LinkedList_reverse__LL();
        L.insert_at_beginning(4);
        L.insert_at_beginning(7);
        L.insert_at_beginning(56);
        L.insert_at_beginning(4233);
        L.insert_at_beginning(40);
        L.reverse();
    }
}
