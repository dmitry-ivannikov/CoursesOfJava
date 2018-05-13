import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by dimas on 10.09.17.
 */
public class Main {
    public static void main(String[] args) throws Exception{

        Resourse resourse = new Resourse();
        resourse.i = 5;
        resourse.j = 2;
        MyThread myThread = new MyThread();
        myThread.setName("one");
        MyThread myThread1 = new MyThread();
        myThread.resourse = resourse;
        myThread1.resourse = resourse;
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        System.out.println("i = " + resourse.i + " j = "+ resourse.j);
    }

    static class MyThread extends Thread{
        Resourse resourse;

        @Override
        public void run() {
            resourse.changeI();
            resourse.changeJ();
        }
    }
}
class Resourse{
    int i;
    int j;

    Lock lock = new ReentrantLock();
    void changeI(){
        lock.lock();
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")){
            Thread.yield();
        }
        i++;
        this.i = i;

    }

    void changeJ(){

        int j = this.j;
        if (Thread.currentThread().getName().equals("one")){
            Thread.yield();
        }
        j++;
        this.j = j;
        lock.unlock();
    }
}