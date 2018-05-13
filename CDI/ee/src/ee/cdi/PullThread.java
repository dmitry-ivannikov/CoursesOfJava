package ee.cdi;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManageableThread;
import javax.enterprise.concurrent.ManagedThreadFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import javax.enterprise.concurrent.ManagedExecutorService;

@WebServlet("/pt")
public class PullThread extends HttpServlet {
    @Resource
    ManagedExecutorService executorService;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        executorService.submit(new MyRunnable());
        try {
            System.out.println(executorService.submit(new MyCallble()).get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
    static class MyCallble<T> implements Callable<String>{
        @Override
        public String call() {
            return "2";
        }
    }
}
