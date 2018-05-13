import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by dimas on 10.09.17.
 */
public class Main {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;

    public static void main(String[] args){
        new AccountMinus().start();
        new AccountPlus().start();
    }

    static class AccountPlus extends Thread{
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread{
        @Override
        public void run() {
            if(account < 10){
                try {
                    lock.lock();
                    System.out.println(account);
                    condition.await();
                    System.out.println(account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            account -= 10;
           System.out.println(account);
        }
    }
}
