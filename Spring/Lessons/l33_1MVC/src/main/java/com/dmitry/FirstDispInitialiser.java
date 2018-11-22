//package com.dmitry;
//
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
//
//public class FirstDispInitialiser extends AbstractDispatcherServletInitializer {
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        XmlWebApplicationContext context = new XmlWebApplicationContext();
//        context.setConfigLocation("WEB-INF/DispServlet-servlet2.xml");
//        return context;
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/first/*"};
//    }
//
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//}
