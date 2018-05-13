/**
 * Created by dimas on 08.09.17.
 */
public class Main {
    public static void main (String[] arg) throws Exception{
        MyThread thread = new MyThread();
        thread.start();
        //Thread.sleep(200);
       // thread.setPriority(7);
       // Thread.yield();
              //thread.pr
        thread.join();
        System.out.println("main");
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}