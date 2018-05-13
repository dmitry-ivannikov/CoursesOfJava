import java.util.concurrent.CountDownLatch;

/**
 * Created by dimas on 10.09.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        new Work(countDownLatch);
        new Work(countDownLatch);



        countDownLatch.await();
        System.out.println("Well done");
    }
}

class Work extends Thread{
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
//        try {
//            sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("done");
        countDownLatch.countDown();
        System.out.println(getName());
        run();
    }
}
