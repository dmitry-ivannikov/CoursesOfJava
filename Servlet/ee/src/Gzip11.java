import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

//@WebServlet("/tee")
public class Gzip11 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if (req.getHeader("Accept-Encoding").contains("gzip")) {
//            PrintWriter printWriter = new PrintWriter(new GZIPOutputStream(resp.getOutputStream()));
//            printWriter.write("Hello");
//        }

//            resp.setStatus(HttpServletResponse.SC_OK);
//            resp.sendRedirect("/hello");
//            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "aaaa");
            resp.setHeader("Refresh", "1");
            System.out.println("hello");
                resp.setHeader("Refresh", "5;URL=https://google.com");
    }
}
