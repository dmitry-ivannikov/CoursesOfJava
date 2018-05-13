import java.util.concurrent.Exchanger;

/**
 * Created by dimas on 11.09.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Exchanger<String> exchanger = new Exchanger<String>();

        new Mike(exchanger);
        new Anket(exchanger);
    }

    static class Mike extends Thread{
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger){
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("My name is Mike");
                sleep(1000);
                exchanger.exchange("I`m 20 years old");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Anket extends Thread{
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger){
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
