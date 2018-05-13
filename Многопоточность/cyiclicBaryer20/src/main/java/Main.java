import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by dimas on 11.09.17.
 */
public class Main {
    public static void main(String[] args){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());
        new Sportsmen(cyclicBarrier);
        new Sportsmen(cyclicBarrier);
        new Sportsmen(cyclicBarrier);
    }

    static class Run extends Thread{
        CyclicBarrier barrier;

        @Override
        public void run() {
            System.out.println("Run is begun");
        }
    }

    static class Sportsmen extends Thread{
        CyclicBarrier barrier;

        public Sportsmen(CyclicBarrier barrier){
            this.barrier = barrier;
            start();
        }

        @Override
        public void run() {
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
