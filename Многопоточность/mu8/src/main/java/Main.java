import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dimas on 08.09.17.
 */
public class Main {
// 9 wait and notify
//    public static void main(String[] args) throws Exception{
//        ThreadB threadB = new ThreadB();
//        threadB.start();
//        synchronized (threadB){
//            threadB.wait();
//        }
//        System.out.println(threadB.total);
//
//    }
//    static class ThreadB extends Thread{
//        int total;
//        @Override
//        public void run() {
//            synchronized (this){
//                for (int i = 0; i < 5; i++) {
//                    total += i;
//                    try {
//                        sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                notify();
//            }
//        }
//    }
static List<String> strings = Collections.synchronizedList(new ArrayList<String>());
    public static void main(String[] args) throws Exception{

        new Operator().start();
        new Machine().start();
    }
    static class Operator extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true){
                synchronized (strings){
                    strings.add(scanner.nextLine());
                    strings.notify();
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    static class Machine extends Thread{
        @Override
        public void run() {

            while(strings.isEmpty()){
                synchronized (strings){
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(strings.remove(0));
                }

            }

        }
    }



}

