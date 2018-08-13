import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
//       Runnable runnable = new Runnable() {
//           public void run() {
//               System.out.println("run");
//           }
//       };

        Runnable runnable = () -> {System.out.println("run");};



//        ActionListener actionListener = new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("hello");
//            }
//        };
        ActionListener actionListener1 = (event) -> System.out.println("hello");

    }
}
