import javax.swing.*;

public class Builder6 {
    public static void main (String[] args){
        SportCar sportCar = new SportCar.Builder("Toyota").setMaxSpeed(300).setColor("white").duild();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
    }
}

class SportCar{
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
    private SportCar(Builder builder){
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed = 200;
    }

    static class Builder{

        private String name;
        private String color;
        private int maxSpeed;

        public Builder(String name){
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        public SportCar duild(){
           return new SportCar(this);
        }
    }
}