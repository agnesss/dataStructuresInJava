package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by UserPC on 1/9/2018.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        TestClass obj = new TestClass();
        TestClass obj2 = new TestClass();

        MyThread thread1 = new MyThread1("T1", obj);
        MyThread thread2 = new MyThread2("T2", obj);
        //MyThread thread3 = new MyThread2("T3", obj);

        thread1.start();
        //thread1.join();

        //Thread.sleep(3000);

        thread2.start();
        //thread2.join();

        Lock lock = new ReentrantLock();
    }

}

