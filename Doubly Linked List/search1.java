// Node class
class Node_search1 {
    int info;
    Node_search1 next;
    Node_search1 prev;
}

// Doubly Linked List class
class LinkedList_search1 {
    Node_search1 start = null;

    // Create a new node with the given element
    Node_search1 createNode(int ele) {
        Node_search1 ptr = new Node_search1();
        ptr.info = ele;
        ptr.next = null;
        ptr.prev = null;
        return ptr;
    }

    // Insert element at the beginning
    void insert_at_beginning(int ele) {
        Node_search1 ptr = createNode(ele);
        if (start == null) {
            start = ptr;
        } else {
            ptr.next = start;
            start.prev = ptr;
            start = ptr;
        }
    }

    // Find position of element from the last (1-based index)
    int position_from_last(int ele) {
        if (start == null) {
            return -1;
        }
        int count = 0;
        Node_search1 temp = start;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backwards to find the element
        while (temp != null) {
            count++;
            if (temp.info == ele) {
                return count;
            }
            temp = temp.prev;
        }
        return -1;  // Element not found
    }

    // Find position of element from the first (1-based index)
    int position_from_first(int ele) {
        int position = 0;
        Node_search1 temp = start;
        while (temp != null) {
            position++;
            if (temp.info == ele) {
                return position;
            }
            temp = temp.next;
        }
        return -1;  // Element not found
    }

    // Display the linked list
    void display() {
        Node_search1 temp = start;
        while (temp != null) {
            System.out.print(temp.info + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class
public class search1 {
    public static void main(String[] args) {
        LinkedList_search1 l = new LinkedList_search1();
        l.insert_at_beginning(3);
        l.insert_at_beginning(93);
        l.insert_at_beginning(34);
        l.insert_at_beginning(31);
        l.insert_at_beginning(13);
        l.insert_at_beginning(35);
        l.display();
        System.out.println("Position from beginning is:");
        System.out.println(l.position_from_first(35));
        System.out.println("Position from last is:");
        System.out.println(l.position_from_last(35));
    }
}
