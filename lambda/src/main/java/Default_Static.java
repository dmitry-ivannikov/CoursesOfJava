import java.util.List;

public class Default_Static {
    public static void main(String[] args) {
        System.out.println(A.add(5, 5));

        A a = new B();
        a.hello();
    }
}

interface A {
    void printMessage(String message);
    static int add(int x, int y){
        return x + y;
    }
    default void hello(){
        printMessage("hello");
    }
}
interface C{
    default void sayHello(){

    }
}
class B implements A, C{// для избежания множественного наследования наследовать интерфейс С от А или переопределить проблемный метод в А
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void hello() {
        System.out.println("new hello");
    }
}