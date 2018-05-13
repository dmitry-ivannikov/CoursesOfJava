package servlets;



import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

@WebFilter(value = "/MyNewFilter")//, initParams = {@WebInitParam(name = "name", value = "value")})
public class myNewFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println(filterConfig.getInitParameter("name"));
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().write("before ");
        if( true){filterChain.doFilter(servletRequest, servletResponse);}
        servletResponse.getWriter().write(" after");
    }

    @Override
    public void destroy() {
        System.out.println("dist");
    }
}

class MyResponseWrapper extends HttpServletRequestWrapper{

    public MyResponseWrapper(HttpServletRequest request) {
        super(request);
    }

}
