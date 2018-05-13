package servlets;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyInnerTag16 extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
      //  getParent();
        Teg13 myteg13 = (Teg13) findAncestorWithClass(this, Teg13.class);
        getJspContext().getOut().print(myteg13.getName());
    }
}