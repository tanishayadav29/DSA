// Node class
class Node_alternateElement {
    int info;
    Node_alternateElement next;
}

// Linked List class
class LinkedList_alternateElement {
    Node_alternateElement start = null;

    // Create a new node with the given element
    Node_alternateElement createNode(int ele) {
        Node_alternateElement node = new Node_alternateElement();
        node.info = ele;
        node.next = null;
        return node;
    }

    // Insert at beginning
    void insert_at_beginning(int ele) {
        Node_alternateElement ptr = createNode(ele);
        ptr.next = start;
        start = ptr;
    }

    // Display the alternative elements of linked list
    void display() {
        Node_alternateElement temp = start;
        while (temp != null) {
            System.out.println(temp.info);
            temp = (temp.next != null) ? temp.next.next : null;
        }
    }
}

// Main class
public class alternateElement {
    public static void main(String[] args) {
        LinkedList_alternateElement L = new LinkedList_alternateElement();
        L.insert_at_beginning(0);
        L.insert_at_beginning(5);
        L.insert_at_beginning(8);
        L.insert_at_beginning(23);
        L.insert_at_beginning(9);
        L.display();       
        }
}

