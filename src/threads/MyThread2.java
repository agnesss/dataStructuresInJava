package threads;

/**
 * Created by UserPC on 1/9/2018.
 */
class MyThread2 extends  MyThread {

    public MyThread2(String name, TestClass obj){
        super(name, obj);
    }

    @Override
    public void run() {
        obj.bar(name);
        //obj.foo(name);
    }
}
