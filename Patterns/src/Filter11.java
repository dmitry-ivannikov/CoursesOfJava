import java.util.ArrayList;
import java.util.List;

public class Filter11 {
    public static void main(String[] args){
        CarF carF = new CarF(150, "white", 4);
        CarF carF2 = new CarF(200, "black", 3);
        CarF carF3 = new CarF(250, "blue", 2);
        List<CarF> cars = new ArrayList<>();
        cars.add(carF);
        cars.add(carF2);
        cars.add(carF3);
//        cars = new SpeedFilter().filter(cars);
//        cars = new DorsFilter().filter(cars);
       // AndFilter andFilter = new AndFilter(new SpeedFilter(), new DorsFilter());
        OrFilter andFilter = new OrFilter(new DorsFilter(), new SpeedFilter());

                cars = andFilter.filter(cars);
        for (CarF car : cars){
            System.out.println(car.getMaxSpeed());
        }
    }
}

interface CarFilter{
    List<CarF> filter(List<CarF> cars);
}

class SpeedFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars){
            if(car.getMaxSpeed() > 180){
                list.add(car);
            }
        }
        return list;
    }
}

class DorsFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for (CarF car : cars){
            if(car.getDors() > 2){
                list.add(car);
            }
        }
        return list;
    }
}

class AndFilter implements CarFilter{
    CarFilter filterOne;
    CarFilter filterTwo;

    public AndFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = filterOne.filter(cars);
        return filterTwo.filter(list);
    }
}

class OrFilter implements CarFilter{
    CarFilter filterOne;
    CarFilter filterTwo;

    public OrFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = filterOne.filter(cars);
        List<CarF> list2 = filterTwo.filter(list);
        for(CarF car : list2){
            if (!list.contains(car)){
                list.add(car);
            }
        }
        return list;
    }
}


class CarF{
    private int maxSpeed;
    private String colour;
    private int dors;

    public CarF(int maxSpeed, String colour, int dors) {
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.dors = dors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDors() {
        return dors;
    }

    public void setDors(int dors) {
        this.dors = dors;
    }
}