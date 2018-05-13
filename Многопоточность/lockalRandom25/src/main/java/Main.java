import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Created by dimas on 11.09.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        System.out.println(ThreadLocalRandom.current().nextInt());

        System.out.println(TimeUnit.DAYS.toMillis(14));
    }
}
