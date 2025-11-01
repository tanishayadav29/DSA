import java.util.Scanner;
class Node_short_programs{
    int info;
    Node_short_programs next;
}
class LinkedList_short_programs{
    Node_short_programs start= null;
    Node_short_programs ptr;
    void CreateNode(int ele){
        ptr= new Node_short_programs();
        ptr.info=ele;
        ptr.next=null;
    }
    void insert_at_beginning(int ele){
        CreateNode(ele);
        if (start==null){
            start=ptr;
        }
        else{
            ptr.next=start;
            start=ptr;
        }
    }
    int max(){
        if (start==null){
            System.out.println("LinkedList is empty!");
            return -1;
        }
        if (start.next==null){
            return start.info;
        }
        Node_short_programs maxNode=start;
        Node_short_programs temp=start.next;
        while (temp!=null){
            if (temp.info> maxNode.info){
                maxNode=temp;
            }
            temp=temp.next;
        }
        return maxNode.info;
    }
    int min(){
        if (start==null){
            System.out.println("LinkedList is empty!");
            return -1;
        }
        if (start.next==null){
            return start.info;
        }
        Node_short_programs minNode=start;
        Node_short_programs temp=start.next;
        while (temp!=null){
            if (temp.info<minNode.info){
                minNode=temp;
            }
            temp=temp.next;
        }
        return minNode.info;
    }
    void insert_till_0(Scanner sc){
        while (true){
            System.out.println("Enter element in linked list:");
            int ele= sc.nextInt();
            if (ele==0){
                display();
                break;
            }
            else{
                insert_at_beginning(ele);
            }
        }
    }
    int average(){
        int sum=0;
        int count=0;
        int avg;
        if (start==null){
            return -1;
        }
        if (start.next==null){
            return start.info;
        }

        Node_short_programs temp= start;
        while (temp!=null){
            sum+=temp.info;
            count+=1;
            temp=temp.next;
        }
        avg=sum/count;
        return avg;
    }
    int reverse (int n){
        int rev=0;
        while (n>0){
            int d= n%10;
            rev= rev*10+d;
            n/=10;
        }
        return rev;
    }
    void reverse_each_element(){
        System.out.println("initially linked list is:");
        display();
        Node_short_programs temp= start;
        while (temp!=null){
            temp.info=reverse(temp.info);
            temp=temp.next;
        }
        display();
    }
    void create_list(int num){
        while (num>0){
            int d= num%10;
            insert_at_beginning(d);
            num/=10;
        }
        display();
    }
    void display(){
        System.out.println("Your final linked list is:");
        Node_short_programs temp= start;
        while (temp!=null){
            System.out.print(temp.info);
            System.out.print("->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    boolean isPrime(int x){
        if (x<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    int countPrime(){
        int count=0;
        Node_short_programs temp= start;
        while (temp!=null){
            if (isPrime(temp.info)){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
}
public class short_programs {
    public static void main(String[] args) {
        LinkedList_short_programs L = new LinkedList_short_programs();
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Enter 1 if you want to find maximum.");
        System.out.println("Enter 2 if you want to find minimum");
        System.out.println("Enter 3 if you want to insert element till user enters 0.");
        System.out.println("Enter 4 if you want to reverse EACH ELEMENT.");
        System.out.println("Enter 5 if you want to make a linkedlist from a number. eg, 1234: 1->2->3->4->");
        System.out.println("Enter 6 to count total number of prime numbers present in a linked list");
        while (true) {
            System.out.println("enter your choice according to menu:");
            int choice = sc.nextInt();
            if (choice == 1) {
                while (true) {
                    System.out.println("firstly enter element into linked list:");
                    int element = sc.nextInt();
                    L.insert_at_beginning(element);
                    System.out.println("Enter 0 if you wish to stop putting elements in linked list:");
                    int stop = sc.nextInt();
                    if (stop == 0) {
                        System.out.println("displaying your current linked list:");
                        break;
                    }
                }
                System.out.println("maximum element is: " + L.max());
            } else if (choice == 2) {
                while (true) {
                    System.out.println("firstly enter element into linked list:");
                    int element = sc.nextInt();
                    L.insert_at_beginning(element);
                    System.out.println("Enter 0 if you wish to stop putting elements in linked list:");
                    int stop = sc.nextInt();
                    if (stop == 0) {
                        System.out.println("displaying your current linked list:");
                        break;
                    }
                }
                System.out.println("minimum element is: " + L.min());
            } else if (choice == 3) {
                L.insert_till_0(sc);
            } else if (choice == 4) {
                while (true) {
                    System.out.println("firstly enter element into linked list:");
                    int element = sc.nextInt();
                    L.insert_at_beginning(element);
                    System.out.println("Enter 0 if you wish to stop putting elements in linked list:");
                    int stop = sc.nextInt();
                    if (stop == 0) {
                        System.out.println("displaying your current linked list:");
                        break;
                    }
                }
                L.reverse_each_element();
            } else if (choice == 5) {
                System.out.println("enter number from which linked list will be made.");
                int number = sc.nextInt();
                L.create_list(number);
            } 
            else if(choice==6){
                while (true) {
                    System.out.println("firstly enter element into linked list:");
                    int element = sc.nextInt();
                    L.insert_at_beginning(element);
                    System.out.println("Enter 0 if you wish to stop putting elements in linked list:");
                    int stop = sc.nextInt();
                    if (stop == 0) {
                        System.out.println("displaying your current linked list:");
                        break;
                    }
                }
                System.out.println("total number of prime number in the linked list are:");
                System.out.println(L.countPrime());
            }
            else {
                System.out.println("invalid choice.");
                System.out.println("EXITING PROGRAM...");
                break;
            }
            System.out.println("enter 0 if you wish to exit the program.");
            int question = sc.nextInt();
            if (question == 0) {
                System.out.println();
                System.out.println("EXITING...");
                break;
            }
        }
    }
}
