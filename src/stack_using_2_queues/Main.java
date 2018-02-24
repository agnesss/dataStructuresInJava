package stack_using_2_queues;

/**
 * Created by UserPC on 12/2/2017.
 */
public class Main {

    public static void main(String[] args) {
        ModernStack<String> newStack = new ModernStack<>(10);

        newStack.push("a");
        newStack.push("b");
        newStack.push("c");

        String res = newStack.pop();
        String res2 = newStack.pop();
        String res3 = newStack.pop();

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);


    }
}
