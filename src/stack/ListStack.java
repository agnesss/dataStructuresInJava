package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserPC on 11/21/2017.
 */
public class ListStack<X> implements Stack<X> {

    private List<X> data;

    public ListStack(){
        data =  new ArrayList<X>();
    }

    @Override
    public void push(X elem) {
        data.add(elem);
    }

    @Override
    public X pop() {
        return data.get(data.size() - 1);
    }

    @Override
    public boolean contains(X elem) {
        return data.contains(elem);
    }

    @Override
    public X access(X elem) {
        while(data.size() > 0){
            X res = pop();
            if(elem.equals(res))
                return res;
        }

        throw new IllegalArgumentException("No such element in the stack");
    }

    @Override
    public int size() {
        return data.size();
    }
}
