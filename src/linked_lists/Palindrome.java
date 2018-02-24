package linked_lists;

/**
 * Created by UserPC on 1/7/2018.
 */
public class Palindrome {

    static boolean checkPal(Node head) {

        if(head == null) return false;

        if(head.next == null) return true;

        Node curr = head;
        Node prev = null;

        while(curr.next != null) {
            prev = curr;
            curr =  curr.next;
        }

        if(head.data.equals(curr.data)) {
            prev.next = null;
            return checkPal(head.next);
        }

        return false;
    }


    public static void main(String[] args) {
        Node a = new Node("1");
        Node b = new Node("2");
        Node c = new Node("6");
        Node d = new Node("2");
        Node e = new Node("1");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next= null;

        System.out.println(checkPal(a));



    }
}
