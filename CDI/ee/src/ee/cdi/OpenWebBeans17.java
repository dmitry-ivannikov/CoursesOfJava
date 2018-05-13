package ee.cdi;

import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;
import org.apache.webbeans.util.WebBeansConstants;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServlet;



public class OpenWebBeans17 {
    public static void main(String[] args){
        ContainerLifecycle lifecycle = WebBeansContext.currentInstance().getService(ContainerLifecycle.class);
        lifecycle.startApplication(null);
        BeanManager beanManager = lifecycle.getBeanManager();
        Bean<?> bean = beanManager.getBeans("mainComtainer").iterator().next();

        MainComtainer mainComtainer = (MainComtainer) lifecycle.getBeanManager().getReference(bean, MainComtainer.class,beanManager.createCreationalContext(bean));
        mainComtainer.runBean();
        lifecycle.stopApplication(null);
    }
}

@Named
class MainComtainer{
    @Inject
    MyyBean myyBean;
    public void runBean(){
        myyBean.print();
    }
}

class MyyBean{
    public void print(){
        System.out.println();
    }
}
