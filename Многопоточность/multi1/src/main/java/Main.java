/**
 * Created by dimas on 07.09.17.
 */
public class Main {
    public  static void main (String[] args) throws Exception
    {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println(Thread.currentThread().getName());
//        MyRunnnable myRunnnable = new MyRunnnable();
//        Thread thread2 = new Thread(myRunnnable);
//        thread2.start();

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}

class MyThread extends Thread{
    @Override
    public void run()
    {
        //System.out.println(Thread.currentThread().getName());
        //System.out.println("new Thread");
        //someMethod();

        for (int i = 0; i < 400; i++) {
           System.out.println(Thread.currentThread().getName() + " i = " + i);
        }
    }
    //private void someMethod(){throw  new RuntimeException();}
}

//class MyRunnnable implements Runnable
//{
//    //@Override
//    public void run()
//    {
//        System.out.println(Thread.currentThread().getName());
//        //System.out.println("new Runnable");
//
//    }
//}