package threads;

/**
 * Created by UserPC on 1/9/2018.
 */
public class TestClass{

    public  static synchronized  /*static synchronized*/ void foo(String name){
        try{
            System.out.println("Thread "+name+ " is STARTING to execute method .foo()");

            Thread.sleep(3000);

            System.out.println("Thread "+name+ " has finished executing method .foo()");
        }catch(InterruptedException ex){
            System.out.println("Thread "+name+ " terminated with exception");
        }
    }

    public static synchronized  /*static synchronized*/ void bar(String name){

        try{
            System.out.println("Thread "+name+ " is STARTING to execute method .bar()");

            Thread.sleep(3000);

            System.out.println("Thread "+name+ " has finished executing method .bar()");
        }catch(InterruptedException ex){
            System.out.println("Thread "+name+ " terminated with exception");
        }
    }

    public static synchronized  /*static synchronized*/ void xxx(String name){
        try{
            System.out.println("Thread "+name+ " is STARTING to execute method .bar()");

            Thread.sleep(3000);

            System.out.println("Thread "+name+ " has finished executing method .bar()");
        }catch(InterruptedException ex){
            System.out.println("Thread "+name+ " terminated with exception");
        }
    }
}
