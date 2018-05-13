import java.util.concurrent.Phaser;

/**
 * Created by dimas on 11.09.17.
 */
public class Main {
    public static void main(String[] args){
        Phaser phaser = new Phaser(2);
        new Washer(phaser);
        new Washer(phaser);

    }

    static class Washer extends Thread {
        Phaser phaser;

         public Washer(Phaser phaser){
             this.phaser = phaser;
             start();
         }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " washing the car of № " + i);
                //phaser.arriveAndAwaitAdvance();

            }
        }
    }
}
