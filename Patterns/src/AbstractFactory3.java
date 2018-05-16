import sun.security.smartcardio.SunPCSC;

public class AbstractFactory3 {
    public static void main(String[] args){
        Factory factoryCar= new AbstuctFactory().createFactory("Car");
        Factory factoruTunk = new AbstuctFactory().createFactory("Tank");
        Car toyota = factoryCar.createCar("Toyota");
        toyota.drive();
        Tank t51 = factoruTunk.createTank("T51");
        t51.drive();
    }
}


interface Car{
    void drive();
}
class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("drive toyota");
    }
}

class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("drive audi");
    }
}

class CarFactory implements Factory{
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default: return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }
}

interface Tank{
    void drive();
}
class T51 implements Tank{
    @Override
    public void drive() {
        System.out.println("drive T51");
    }
}

class T52 implements Tank{
    @Override
    public void drive() {
        System.out.println("drive T52");
    }
}

class TankFactory implements Factory{
    public Tank createTank(String typeOfTank){
        switch (typeOfTank){
            case "T51" : return new T51();
            case "T52" : return new T52();
            default: return null;
        }
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}

interface Factory{
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

class AbstuctFactory{
    Factory createFactory(String typeOfFactory){
        switch (typeOfFactory) {
           case  "Car" : return new CarFactory();
           case  "Tank" : return  new TankFactory();
            default: return null;
        }
    }
}