package ee.cdi;

import sun.rmi.runtime.Log;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/point")
public class InjectionPoint7 extends HttpServlet{
    //Logger logger = Logger.getLogger(InjectionPoint7.class.getName());
    @Inject
    MyLogger mylogger;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  logger.log(Level.ALL, "Сейчас что то призойдёт");
    }
}

class MyLogger{
    @Produces
    public Logger getLogger(InjectionPoint injectionPoint){
        return Logger.getLogger(injectionPoint.getType().toString());
    }
}