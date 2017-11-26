package queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserPC on 11/26/2017.
 */
public class ListQueue<X> implements Queue<X> {

    private List<X> data;

    public ListQueue(){
        data = new ArrayList<X>();
    }

    @Override
    public void enQueue(X elem) {
        data.add(elem);
    }

    @Override
    public X deQueue() {
        return data.get(0);
    }

    @Override
    public boolean contains(X elem) {
        return data.contains(elem);
    }

    @Override
    public X access(int position) {
        return data.get(position);
    }

    @Override
    public int size() {
        return data.size();
    }
}
