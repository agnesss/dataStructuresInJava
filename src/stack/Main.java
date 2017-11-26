package stack;

/**
 * Created by UserPC on 11/21/2017.
 */
public class Main {

    public static void main(String[] args) {

        Stack<String> basicStack = new ListStack<String>();
        // stack.Stack<String> basicStack = new stack.BasicStack<String>(10);


        basicStack.push("first");
        basicStack.push("second");
        basicStack.push("third");

        System.out.println(basicStack.size());
        System.out.println(basicStack.pop());

        System.out.println(basicStack.contains("ana"));

        String foundElem =  basicStack.access("first");

        System.out.println(foundElem);
        System.out.println(basicStack.size());

    }
}
