package base.l2_helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class L2_HelloWorld {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        DaVinchiCode bean = context.getBean(DaVinchiCode.class);
        bean.read();
    }
}
