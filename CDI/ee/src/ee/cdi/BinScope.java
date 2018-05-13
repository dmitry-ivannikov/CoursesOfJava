package ee.cdi;

import javax.enterprise.context.*;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/scope")
public class BinScope extends HttpServlet {
    @Inject
    MyBean bean;
    @Inject
    ChangeMyBeab changeMyBeab;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        bean.i = 5;
        changeMyBeab.changeI();
        resp.getWriter().write(bean.i + "");
    }
}

//@ApplicationScoped
//@SessionScoped
//@RequestScoped// яко синглтон будет менятся
//@ConversationScoped
//@Dependent яко прототайп каждый раз новое
class MyBean{
    int i;
}

class ChangeMyBeab{
    @Inject
    MyBean myBean;
        public void changeI(){
            myBean.i = 2;
        }
}