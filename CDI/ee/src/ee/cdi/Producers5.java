package ee.cdi;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@WebServlet("/pro")
public class Producers5 extends HttpServlet {
    @Inject
    String s;
    @Inject
    int i;
    @Inject
    @S2
    String s2;
    @Inject
    double d;
    @Inject
    Car car;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(s + " " + i + " " + d + " " + car.name + " "  + s2);
    }
}
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
@interface  S2 {};

class Producer0{
    @Produces
    String s = "Hello";
    @Produces
    @S2
    String s2 = "hehe";
    @Produces
    int i = 5;
    @Produces
    double getDouble(){
        return 1 + 3.3 + 5.8;
    }
    @Produces
    Car getCar(){
        return  new Car("toyota");
    }
}



class Car {
    String name;

    public Car(String name){
        this.name = name;
    }
}