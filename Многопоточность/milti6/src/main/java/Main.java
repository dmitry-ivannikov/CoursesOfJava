import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by dimas on 08.09.17.
 */
public class Main {
    static AtomicInteger atomicInteger = new AtomicInteger(0);


    public static void main(String[] args) throws Exception{

        for (int j = 0; j < 10000; j++) {
            new MyTread().start();
        }
        Thread.sleep(2000);
        System.out.println(atomicInteger.get());
    }

    static class MyTread extends Thread{
        @Override
        public void run(){atomicInteger.incrementAndGet();}
    }
}
