import java.util.Scanner;

// Node class
class Node_insertion {
    int info;
    Node_insertion next;
}

// Linked List class
class LinkedList_insertion {
    Node_insertion start = null;

    // Create a new node with the given element
    Node_insertion createNode(int ele) {
        Node_insertion node = new Node_insertion();
        node.info = ele;
        node.next = null;
        return node;
    }

    // Insert at beginning
    void insert_at_beginning(int ele) {
        Node_insertion ptr = createNode(ele);
        ptr.next = start;
        start = ptr;
    }

    // Insert at end
    void insert_at_end(int ele) {
        Node_insertion ptr = createNode(ele);
        if (start == null) {
            start = ptr;
            return;
        }
        Node_insertion temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ptr;
    }

    // Insert at a specific position
    void insert_at_position(int ele, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position entered");
            return;
        }

        Node_insertion ptr = createNode(ele);

        if (pos == 1) {
            ptr.next = start;
            start = ptr;
            return;
        }

        Node_insertion temp = start;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        ptr.next = temp.next;
        temp.next = ptr;
    }

    // Display the linked list
    void display() {
        Node_insertion temp = start;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.next;
        }
        System.out.println("null\n");
    }
}

// Main class
public class Insertion {
    // Helper to print menu
    static void printMenu() {
        System.out.println("\nMENU");
        System.out.println("Enter 1 to insert at beginning");
        System.out.println("Enter 2 to insert at end");
        System.out.println("Enter 3 to insert at a given position");
    }

    public static void main(String[] args) {
        LinkedList_insertion L = new LinkedList_insertion();
        Scanner sc = new Scanner(System.in);
        int element;

        printMenu();

        while (true) {
            System.out.print("\nEnter your choice according to MENU: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // Insert at beginning
                while (true) {
                    System.out.print("Enter element into linked list: ");
                    element = sc.nextInt();
                    L.insert_at_beginning(element);
                    System.out.print("Enter 0 to stop inserting at beginning: ");
                    int ques = sc.nextInt();
                    if (ques == 0) {
                        System.out.println("\nDisplaying your current linked list:");
                        System.out.println("Elements added from beginning:");
                        L.display();
                        break;
                    }
                }
            } else if (choice == 2) {
                // Insert at end
                while (true) {
                    System.out.print("Enter element into linked list: ");
                    element = sc.nextInt();
                    L.insert_at_end(element);
                    System.out.print("Enter 0 to stop inserting at end: ");
                    int ques = sc.nextInt();
                    if (ques == 0) {
                        System.out.println("\nDisplaying your current linked list:");
                        System.out.println("Elements added from end:");
                        L.display();
                        break;
                    }
                }
            } else if (choice == 3) {
                // Insert at position
                while (true) {
                    System.out.print("Enter element into linked list: ");
                    element = sc.nextInt();
                    System.out.print("Enter the position at which you wish to insert the element: ");
                    int position = sc.nextInt();
                    L.insert_at_position(element, position);
                    System.out.print("Enter 0 to stop inserting at specific positions: ");
                    int ques = sc.nextInt();
                    if (ques == 0) {
                        System.out.println("\nDisplaying your current linked list:");
                        System.out.println("Elements added at specific positions:");
                        L.display();
                        break;
                    }
                }
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Enter 0 to exit the insertion program or any other number to continue: ");
            int question = sc.nextInt();
            if (question == 0) {
                System.out.println("\nYour final linked list:");
                L.display();
                System.out.println("EXITING...");
                break;
            }

            printMenu(); // reprint menu for next round
        }

        sc.close();
    }
}
