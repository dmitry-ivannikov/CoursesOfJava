import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;



//@WebServlet("/thread")
public class ThreadServlet7 extends HttpServlet {

   static int i = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        synchronized (this) {
            for (int j = 0; j < 1_000000; j++) {
                i++;
            }

        System.out.println(i);
        //System.out.println(Thread.currentThread().getName());
     }
    }

    public static void main(String[] args){
        for (int i = 0; i < 2; i++) {
            new Thread(){
                @Override
                public void run() {
                        try {
                            URLConnection urlConnection = new URL("http://localhost:8080/thread").openConnection();
                            urlConnection.getInputStream();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                }
            }.start();
        }
    }


}
