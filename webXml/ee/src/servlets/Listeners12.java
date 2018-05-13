package servlets;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listeners12 implements ServletContextListener {//Context listeners

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("init context");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("destroy context");
    }
}
