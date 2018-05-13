package ee.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/inter")
public class Intercrptors12 extends HttpServlet{
    @Inject
    LiveCyc liveCyc;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        liveCyc.doJob();
        liveCyc.doJob2();
    }
}
class Interceptor{
    @AroundConstruct
    private void aroundConstruct(InvocationContext invocationContext) throws Exception {
        System.out.println("before constuct");
        invocationContext.proceed();
    }
    @PostConstruct
    private void postConstuct(InvocationContext invocationContext) throws Exception {
        System.out.println("post constuct");
        invocationContext.proceed();
    }
    @AroundInvoke
    private Object around(InvocationContext context) throws Exception {
        System.out.println("before mathod");
        return context.proceed();
    }
    @PreDestroy
    private void preDestroy(){
        System.out.println("pre Destriy");
    }
}
@RequestScoped
@javax.interceptor.Interceptors(Interceptor.class)
class LiveCyc{
    LiveCyc(){
        System.out.println("construct");
    }
    public void doJob(){
        System.out.println("do job");
    }
    public void doJob2(){
        System.out.println("do job2");
    }

}
