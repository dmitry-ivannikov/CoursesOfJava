import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by dimas on 11.09.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        final BlockingQueue<String> queue = new PriorityBlockingQueue<String>();


        new Thread(){
            @Override
            public void run() {
                try {

                    System.out.println(queue.take());
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

        }.start();

        new Thread(){
            @Override
            public void run() {
                queue.add("String");
            }
        }.start();

    }
}
