package ee.cdi;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dis")
public class Disposes6  extends HttpServlet{

    @Inject
    Car2 car;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(car.name );
    }
}


class Producer{
    @Produces
    Car2 getCar(){
        return  new Car2("toyota");
    }

    public void clean(@Disposes Car2 car ){
        car.clean();

    }
}



class Car2 {
    String name;

    public Car2(String name){
        this.name = name;
    }

    public void clean(){
        System.out.println("car clean");
    }
}
