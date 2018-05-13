import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by dimas on 10.09.17.
 */
public class Main {
    public static void main(String[] args){
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new Mythread(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
    static class Mythread extends Thread{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
