package queue;

/**
 * Created by UserPC on 11/26/2017.
 */
public interface Queue<X> {

    void enQueue(X elem);
    X deQueue();
    boolean contains(X elem);
    X access(int position);
    int size();
}
