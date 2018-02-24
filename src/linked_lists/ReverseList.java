package linked_lists;

/**
 * Created by UserPC on 1/6/2018.
 */
public class ReverseList {

    static Node reverseLinkedList(Node head) {

        Node prev = head;
        int counter = 0;

        while(prev.next != null) {
            counter++;
            prev = prev.next;
        }

        Node tail = prev;
        prev = head;

        while(counter > 0) {

            if(tail.next == null) {
                tail.next = prev;
                Node newN = prev.next;
                prev.next = null;
                prev = newN;
            }
            else {
                Node aux = prev.next;
                Node tmp = tail.next;
                tail.next = prev;
                prev.next = tmp;
                prev = aux;
            }
            counter-- ;
        }
       return prev;
    }

    public static void main(String[] args) {

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        //Node h = reverseLinkedList(a);

        Node.printLinkedList(reverseLinkedList(a));

    }
}
