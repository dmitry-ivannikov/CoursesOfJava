import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/temp")
public class Cookies13  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
        Cookie cookie = new Cookie("testCooken", "abc");
        resp.addCookie(cookie);
        cookie.setMaxAge(1);
        //cookie.setDomain();
    }
}
