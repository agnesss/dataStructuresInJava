package queue;

/**
 * Created by UserPC on 11/26/2017.
 */
public class Main {

    public static void main(String[] args) {
        //Queue<String> myQueue = new BasicQueue<>(10);
        Queue<String> myQueue = new ListQueue<>();

        myQueue.enQueue("first");
        myQueue.enQueue("second");
        myQueue.enQueue("third");

        System.out.println(myQueue.size());

/*        String res =  myQueue.deQueue();
        System.out.println(res);


        String res2 =  myQueue.deQueue();
        System.out.println(res2);


        String res3 =  myQueue.deQueue();
        System.out.println(res3);*/

        System.out.println(myQueue.contains("first"));
        System.out.println(myQueue.access(1));
    }
}
