import java.util.concurrent.ThreadFactory;

/**
 * Created by dimas on 11.09.17.
 */
public class Main {
    public static void main(String[] args){
        ThreadFactory threadFactory = new ThreadFactory() {
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
        threadFactory.newThread(new MyRun()).start();
    }

    static class  MyRun implements Runnable{
        public void run() {
            System.out.println(1);
        }
    }
}
