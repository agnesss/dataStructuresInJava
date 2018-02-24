package linked_lists;

/**
 * Created by UserPC on 1/6/2018.
 */
public class Node {

        public String data;
        public Node next;

        public Node(String data) {
            this.data = data;
        }

        void setNode(Node n) {
            this.next = n;
        }

    public static void printLinkedList(Node head) {
        while(head.next != null) {
            System.out.println(head.data);
            head  = head.next;
        }
        System.out.println(head.data);
    }

}
