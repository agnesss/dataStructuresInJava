package stack;


public interface Stack<X> {

    void push(X elem);

    X pop();

    boolean contains(X elem);

    X access(X elem);

    int size();
}
