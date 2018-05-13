/**
 * Created by dimas on 08.09.17.
 */
public class Main {

    volatile static int i = 0;

    public static void main(String[] args) throws Exception{
        MyThreadRead read = new MyThreadRead();
        read.start();

        read.join();

        MyThreadWrite write = new MyThreadWrite();
        write.start();
    }

    static class MyThreadWrite extends Thread{
    @Override
    public synchronized void run(){
        while (i < 5) {
            System.out.println("inc i" + (++i));
//            try {
//               // Thread.;
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
    }
    }

    static class MyThreadRead extends Thread{
        @Override public synchronized void run(){
            int licalVar = i;
            while(licalVar < 5){
                if(licalVar != i){
                    System.out.println("new value of i" +i);
                    licalVar = i;

                }}
        }}
}
