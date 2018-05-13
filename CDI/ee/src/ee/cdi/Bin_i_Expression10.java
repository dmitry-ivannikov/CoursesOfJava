package ee.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bie")
public class Bin_i_Expression10 extends HttpServlet {
    @Inject
    MyBeann myBeann;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/BeanExample.jsp");
        dispatcher.forward(req, resp);
    }
}

@RequestScoped
@Named
class MyBeann{
    private String s ="hello world";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}