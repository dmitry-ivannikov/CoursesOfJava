import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(value = "ass", asyncSupported = true)
public class Ass15 extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext = req.getAsyncContext();
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                //
            }
        });
        asyncContext.complete();
    }
}
