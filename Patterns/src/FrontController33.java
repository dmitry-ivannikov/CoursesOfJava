import java.util.Scanner;

public class FrontController33 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNext()){
                String nextLine = scanner.nextLine();
                new Thread(){
                    @Override
                    public void run() {
                        new DispatcherServlet().pocess(nextLine);
                    }
                }.start();
                new DispatcherServlet().pocess(scanner.nextLine());
            }
        }
    }
}
class DispatcherServlet{
    void pocess (String url){
        switch (url){
            case "home" : new HomeController().show(); break;
            case  "user" : new UserController().show(); break;
            default: new DefaultController().show();
        }
    }
}
class HomeController{
    void show(){
        System.out.println("this is home page");
    }
}
class UserController{
    void show(){
        System.out.println("this is user page");
    }
}
class DefaultController{
    void show(){
        System.out.println("error");
    }
}