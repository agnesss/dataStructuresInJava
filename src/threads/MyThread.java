package threads;

/**
 * Created by UserPC on 1/9/2018.
 */
public abstract class MyThread extends Thread {
    protected String name;
    protected TestClass obj;

    public MyThread(String name, TestClass myClass) {
        this.name = name;
        this.obj = myClass;
    }

    public abstract void run();
}
