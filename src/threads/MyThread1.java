package threads;

/**
 * Created by UserPC on 1/9/2018.
 */
public class MyThread1 extends MyThread {

    public MyThread1(String name, TestClass obj){
        super(name, obj);
    }

    @Override
    public void run() {
        obj.foo(name);
    }
}
