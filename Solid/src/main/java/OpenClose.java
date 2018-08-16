public class OpenClose {
    public static void main(String[] args) {
        //Toyota toyota = new Toyota();
        Celica celica  = new Celica();
        workInTaxi(celica);
    }
    static void workInTaxi(Car car){//toyota toyota
//        if (toyota instanceof Celica){
//            toyota.getPasanger();
//        } else {
//            toyota.getPasangers();
//        }
        car.workInTaxi();

    }
}
interface  Car{
    void workInTaxi();
        }

class Toyota implements Car{
    void getPasangers(){
        System.out.println("get pasangers");
    }
//    void getPasanger(){
//        System.out.println("get pasanger");
//    }

    public void workInTaxi() {

    }
}

class Celica extends Toyota{
    @Override
    public void workInTaxi() {
        getPasanger();
    }
    void getPasanger(){
        System.out.println("get pasanger");
    }

}