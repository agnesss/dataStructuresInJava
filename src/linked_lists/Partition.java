package linked_lists;

/**
 * Created by UserPC on 1/6/2018.
 */
public class Partition {

    public static Node partition(Node head, int part) {
        Node prev = head;

        while(prev.next != null) {
            Node curr = prev.next;

            if(Integer.parseInt(curr.data) < part) {
                prev.next = curr.next;
                curr.next = head.next;
                head.next = curr;
            }
             else {
                prev = prev.next;
            }
        }

        if(Integer.parseInt(head.data) > part) {
            prev.next = head;
            Node newHead = head.next;
            head.next = null;

            return newHead;
        }
        return head;
    }

    public static void main(String[] args) {

        Node a = new Node("11");
        Node b = new Node("5");
        Node c = new Node("8");
        Node d = new Node("5");
        Node e = new Node("10");
        Node f = new Node("2");
        Node g = new Node("1");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;

        //Node.printLinkedList(a);

        Node head = partition(a, 5);

        Node.printLinkedList(head);


    }
}
