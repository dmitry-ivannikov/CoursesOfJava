package ee.cdi;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InterceptorBinding;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@WebServlet("/inbin14")
public class InterceptorsBinding14 extends HttpServlet{
    @Inject
    InterceptorServicee interceptorServicee;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        interceptorServicee.doJob();
    }
}

@InterceptorBinding
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface One{}

@One//need in been xml
@Interceptor
class IntercepterOnee{
    @AroundInvoke
    private Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("one");
        return context.proceed();
    }
}

class IntercepterTwoo{
    @AroundInvoke
    private Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("two");
        return context.proceed();
    }
}

@One
class InterceptorServicee{
    public void doJob(){
        System.out.println("do job");
    }
}