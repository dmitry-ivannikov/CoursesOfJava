package base.l2_helloworld;


import org.springframework.stereotype.Component;

@Component
public class DaVinchiCode  implements Book{
    public void read() {
        System.out.println("read");
    }
}
