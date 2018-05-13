package ee.cdi;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@WebServlet("/Conversation Scope")
public class ConversationScope9 extends HttpServlet{
    @Inject
    ConversationBean conversationBean;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(conversationBean.i);
        conversationBean.i = 1;
        conversationBean.startConversation();
        System.out.println(conversationBean.i);
        System.out.println("middle");
        conversationBean.i = 3;
        conversationBean.endConversation();
        System.out.println(conversationBean.i);
    }
}
@ConversationScoped
class ConversationBean implements Serializable{
    int i;
    @Inject
    Conversation conversation;
    public void startConversation(){
        System.out.println(i);
        System.out.println("start");
        conversation.begin();
        i = 2;

    }
    public void endConversation(){
        System.out.println("end");
        conversation.end();
    }
}
