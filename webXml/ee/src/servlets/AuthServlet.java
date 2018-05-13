package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

public class AuthServlet extends HttpServlet {
    @Override// less9
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.isUserInRole("adminciches")){
            resp.getWriter().write("user is admin");
            System.out.println(req.getRemoteUser());
            //Principal userPrincopal = req.getRemoteUser();
        }
    }
}
