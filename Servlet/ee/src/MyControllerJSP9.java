import jsp.MyModelJSP9;
import jsp.StudentJSP9;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/MyControllerJSP9")
public class MyControllerJSP9 extends HttpServlet {
    MyModelJSP9 myModelJSP9 = new MyModelJSP9();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentJSP9 studentJSP9 = myModelJSP9.getStugent();
        req.setAttribute("stud", studentJSP9);
       // req.getSession().setAttribute("Student", studentJSP9);
       // req.getServletContext().setAttribute("Student", studentJSP9);

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        req.setAttribute("list", list);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/111/MyViewJSP9.jsp");
        requestDispatcher.forward(req, resp);
    }
}
