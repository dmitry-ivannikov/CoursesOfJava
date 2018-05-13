import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

//@WebServlet("/temp")
public class parametrs8 extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String one = req.getParameter("one");
//        System.out.println(one);
        //http://localhost:8080/temp?one=hello&two=world



//        String[] ones = req.getParameterValues("one");
//        for (String s : ones){
//            System.out.println(s);
//            //http://localhost:8080/temp?one=hello&one=world
//        }

//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            //System.out.println(parameterNames.nextElement());
//            String elementNmae = parameterNames.nextElement();
//            System.out.println(elementNmae + " = " + req.getParameter(elementNmae));
//        }


        // Map<String, String[]> parameterMap = req.getParameterMap();

//        System.out.println(req.getRequestURL());
//        System.out.println(req.getRequestURI());
//        System.out.println(req.getServletPath());
//        System.out.println(req.getRemoteHost());
//        System.out.println(req.getLocalPort());

//        System.out.println(req.getQueryString());



        String one = req.getParameter("one");
        one =  one == null ? "" : one.replaceAll("<", "&lt").replaceAll(">", "&gt");
       // String two = req.getParameter("two");
        resp.getWriter().write( "<html>"+
                "<head></head>" +
                "<body>" +
                "one = " + one +
         //       " two = " + two +
                "<form action='temp' method='post'>" +
          //      "<input type='text' name='one'/>" +
                "<textarea  name='one'></textarea>" +
          //      "<input type='text' name='two'/>" +
                "<input type='submit' name='submit'/>" +
                "</from>" +
                "</body>" +
                "</html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
