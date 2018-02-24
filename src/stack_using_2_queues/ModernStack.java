package stack_using_2_queues;


import queue.BasicQueue;
import queue.Queue;


/**
 * Created by UserPC on 12/2/2017.
 */
public class ModernStack<X> {

    private Queue<X> q, tmp;

    private int maxSize;

    public ModernStack(int capacity) {
        this.maxSize = capacity;

        q = new BasicQueue<X>(maxSize);
        tmp = new BasicQueue<X>(maxSize);
    }


    public void push(X elem) {
        if(q.size() == 0) {
            q.enQueue(elem);
        } else  {
            int len = q.size();
            while(len > 0) {
                 tmp.enQueue(q.deQueue());
                len--;
            }
            q.enQueue(elem);

            len = tmp.size();
            while(len > 0) {
                q.enQueue(tmp.deQueue());
                len--;
            }
        }
    }

    public X pop() {
        return q.deQueue();
    }


}
