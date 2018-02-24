package linked_lists;

/**
 * Created by UserPC on 1/6/2018.
 */
public class SumLists {

    public static Node sumLists(Node p, Node q) {
        Node headSum = null;

        boolean addOne = false;

        int sum = Integer.parseInt(p.data) + Integer.parseInt(q.data);
        if(sum > 9) {
            addOne = true;
        }
        headSum = new Node(sum % 10 + "");

        while( p.next != null & q.next != null ){
            Node currP = p.next;
            Node currQ = q.next;

            sum = Integer.parseInt(currP.data) + Integer.parseInt(currQ.data);

            int value = 0;

            if(sum > 9) {
                if(addOne) {
                    value = (sum + 1) % 10;
                }
                else {
                    value = sum % 10;
                }
                addOne = true;
            }
            else {
                if(addOne)
                    value = sum + 1;
                else value = sum;

                addOne = false;
            }


            addNodeAtTheEnd(headSum, value);

            p = p.next;
            q = q.next;
        }

        return headSum;
    }

    private static void addNodeAtTheEnd(Node head, int value) {

        if(head != null) {
            Node curr = head;

            while(curr.next != null)
                curr = curr.next;

            curr.next = new Node(value + "");
        }
    }

    public static void main(String[] args) {

        Node p1 = new Node("7");
        Node p2 = new Node("1");
        Node p3 = new Node("6");

        p1.next = p2;
        p2.next = p3;
        p3.next = null;

        Node q1 = new Node("5");
        Node q2 = new Node("9");
        Node q3 = new Node("2");

        q1.next = q2;
        q2.next = q3;
        q3.next = null;

        Node headSum = sumLists(p1, q1);

        Node.printLinkedList(headSum);
    }
}
