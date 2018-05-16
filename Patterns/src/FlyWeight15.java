import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyWeight15 {
    public static void main(String[] args){
        FlyWieghtGarage flyWieghtGarage = new FlyWieghtGarage();
        Mercedes mercedes = flyWieghtGarage.getMercedes("green");
        Mercedes mercedes2 = flyWieghtGarage.getMercedes("green");
        System.out.println(mercedes.color);
    }
}

class Mercedes{
    String color;
}

class FlyWieghtGarage{
    Map<String,Mercedes> map = new HashMap<>();
    Mercedes getMercedes(String color){
        Mercedes mercedes = map.get(color);
        if (mercedes == null){
            mercedes = new Mercedes();
            mercedes.color = color;
            map.put(color, mercedes);
        }
        return mercedes;
    }
}