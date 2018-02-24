package threads;

/**
 * Created by UserPC on 1/9/2018.
 */
public class MyThread3 extends MyThread {

    public MyThread3(String name, TestClass obj){
        super(name, obj);
    }
    @Override
    public void run() {
        obj.xxx(name);
    }
}
