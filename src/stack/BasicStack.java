package stack;

public class BasicStack<X> implements Stack<X> {

    private X [] elements;
    private int no;


    public BasicStack(int maxSize) {
        elements = (X[]) new Object[maxSize];
        no = 0;
    }

    public void push(X elem) {
        elements[no++] = elem;
    }

    public X pop() {
        if(no == 0) throw new IllegalStateException("There are no elements in the stack");
        return elements[--no];
    }

    //define contains and access methods

    public boolean contains(X elem) {
        boolean  found = false;

        for(int i = 0; i< no; i++){
            if(elements[i].equals(elem)){
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(X elem) {
        while(no > 0){
            X res = pop();

            if(elem.equals(res)){
                return res;
            }
        }
        throw new IllegalArgumentException("No such element in the stack");
    }

    public int size(){
        return no;
    }
}
