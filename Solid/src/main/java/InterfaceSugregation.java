public class InterfaceSugregation {
    public static void main(String[] args) {
        Worker iworker = new Cook2();
        iworker.work();
        ((Cook2) iworker).eat();
        iworker.work();
    }
}

//interface Iworker{
//    void work();
//    void eat();
//
//}
interface Worker{
    void work();
}
interface Eater{
    void eat();
}

class Cook2 implements  Worker, Eater{
    public void work() {
        System.out.println("w");
    }

    public void eat() {
        System.out.println("e");
    }
}

class Waiter implements Worker{
    public void work() {
        System.out.println("deliver");
    }


}