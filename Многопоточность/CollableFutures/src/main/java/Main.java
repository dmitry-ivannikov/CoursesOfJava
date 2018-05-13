import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by dimas on 10.09.17.
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new MyCallable();
        FutureTask futureTack = new FutureTask(callable);
        new Thread(futureTack).start();
        System.out.println(futureTack.get());

    }

    static class MyCallable implements Callable<Integer>{
        //@Override
        public Integer call() throws Exception{
            int j = 0;
            for (int i = 0; i < 10; i++, j++) {
                Thread.sleep(300);
            }return j;
        }

    }

}
