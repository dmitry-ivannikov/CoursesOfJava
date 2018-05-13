import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dimas on 10.09.17.
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        System.out.println(executorService.submit(new MyCollable()).get());
        executorService.shutdown();
    }
    static class MyRunnable implements Runnable{
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCollable implements Callable<String>{
        public String call() throws Exception {
            return "2";
        }
    }
}
