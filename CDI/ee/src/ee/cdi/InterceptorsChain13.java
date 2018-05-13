package ee.cdi;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/chain")
public class InterceptorsChain13 extends HttpServlet {
    @Inject
    InterceptorService interceptorService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        interceptorService.doJob();
    }
}

class IntercepterOne{
    @AroundInvoke
    private Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("one");
        return context.proceed();
    }
}

class IntercepterTwo{
    @AroundInvoke
    private Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("two");
        return context.proceed();
    }
}

class IntercepterThree{
    @AroundInvoke
    private Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("three");
        return context.proceed();
    }
}

@Interceptors({IntercepterOne.class,IntercepterTwo.class,IntercepterThree.class})
class InterceptorService{
    public void doJob(){
        System.out.println("do job");
    }
}