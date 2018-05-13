package ee.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/life cycle")
public class LifeCycle11 extends HttpServlet{
    @Inject
    LifeCycleBean lifeCycleBean;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        lifeCycleBean.doJob();
        lifeCycleBean.doJob2();
    }
}

class LifeCycleBean{
     public LifeCycleBean(){
        System.out.println("construct");
    }
    @PostConstruct
    private void postConsctuct(){
        System.out.println("post Constuct");
    }
    @AroundInvoke
    private Object aroundMet(InvocationContext context) throws Exception {
        System.out.println("before nethood");
        return context.proceed();
    }
    public void doJob(){
        System.out.println("do job1");
    }

    public void doJob2(){
        System.out.println("do job2");
    }

    @PreDestroy
    private void preDestriy(){
        System.out.println("predestroy");
    }
}