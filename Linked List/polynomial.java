class poly{
    int coff;
    int power;
    poly next;
    poly(int c,int p){
        coff=c;
        power=p;
    }
}
class sum_polynomial{

    poly head = null;

    void addNode(int c, int p, poly ptr) {
        poly newNode = new poly(c, p);
        if (head == null) {
            head = newNode;
        }
        else {
            poly temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addition(poly ptr1, poly ptr2,poly result){
        int c,p;
        while (ptr1!=null&&ptr2!=null){
            if (ptr1.power>ptr2.power){
                c=ptr1.coff;
                p=ptr1.power;
                ptr1=ptr1.next;
            }
            else if(ptr2.power>ptr1.power){
                c=ptr2.coff;
                p=ptr2.power;
                ptr2=ptr2.next;
            }
            else{
                c=ptr1.coff+ptr2.coff;
                p=ptr1.power;
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
            addNode(c,p,result);
        }
        if( ptr1==null){
            for(;ptr2!=null;ptr2=ptr2.next){
                addNode(ptr2.coff,ptr2.power,result);
            }
        }
        if( ptr2==null){
            for(;ptr1!=null;ptr1=ptr1.next){
                addNode(ptr1.coff,ptr1.power,result);
            }
        }
    }
    void display() {
        poly temp = head;
        while (temp != null) {
            System.out.print(temp.coff + "x^" + temp.power);
            if (temp.next != null) System.out.print(" + ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class polynomial {
    public static void main(String[] args) {
        sum_polynomial ob1= new sum_polynomial();
        sum_polynomial ob2= new sum_polynomial();
        sum_polynomial ob= new sum_polynomial();

        ob1.addNode(3,3,ob1.head);
        ob1.addNode(2,2,ob1.head);
        ob1.addNode(5,0,ob1.head);

        ob2.addNode(4, 3, ob2.head);
        ob2.addNode(3, 1, ob2.head);
        ob2.addNode(2, 0, ob2.head);

        System.out.print("Polynomial 1: ");
        ob1.display();
        System.out.print("Polynomial 2: ");
        ob2.display();

        ob.addition(ob1.head, ob2.head, ob.head);

        System.out.print("Sum: ");
        ob.display();
    }
}
