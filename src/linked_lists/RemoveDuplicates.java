package linked_lists;

import java.util.HashMap;

/**
 * Created by UserPC on 1/5/2018.
 */
public class RemoveDuplicates {

    static void removeDuplicates(Node head) {
        HashMap<String, Integer> map = new HashMap<>();

        Node prev = head;

        map.put(prev.data, 1); //insert the data of the first node

        while(prev.next != null) {
            Node curr = prev.next;

            if(map.containsKey(curr.data)) {
                prev.next = curr.next;
            }
            else {
                map.put(curr.data, 1);
                prev = curr;
            }
        }


    }


    public static void main(String[] args) {

        Node a = new Node("1");
        Node b = new Node("2");
        Node c = new Node("3");
        Node d = new Node("1");
        Node e = new Node("2");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        //printLinkedList(a);

        removeDuplicates(a);

        Node.printLinkedList(a);
    }
}
