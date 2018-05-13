/**
 * Created by dimas on 08.09.17.
 */
public class Main {
    public static void main(String[] args) throws  Exception{
//       Resourse resourse  = new Resourse();
//        resourse.i = 5;
        Resourse.i = 5;
        MyThread myThread1 = new MyThread();
        //myThread1.setResourse(resourse);
        MyThread myThread2 = new MyThread();
        //myThread2.setResourse(resourse);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(Resourse.i);
    }
}

class MyThread extends Thread{
    Resourse resourse;

    public void setResourse(Resourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {
        Resourse.changeStaticI();
        new Resourse().changeI();
    }
}

class Resourse{
    static int i;
    public synchronized void changeI(){
        int i = this.i;
        i++;
        this.i = i;
    }
public synchronized static void changeStaticI(){
    int i = Resourse.i;
    i++;
    Resourse.i = i;
}
}