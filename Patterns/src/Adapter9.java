public class Adapter9 {
    public static void main(String[] args){
        CarWash carWash = new CarWash();
        carWash.washCar(new Toyota2());
        carWash.washCar(new TrackWrap(new MrTrack()));
    }
}

class TrackWrap implements Car2{
    Track track;

    public TrackWrap(Track track){
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}

interface Track{
    void clean();
}

class MrTrack implements Track{
    @Override
    public void clean() {
        System.out.println("Track is clean");
    }
}


interface Car2{
    void wash();
}

class Toyota2 implements Car2{
    @Override
    public void wash() {
        System.out.println("wash Car");
    }
}

class CarWash{
    public void washCar(Car2 car){
        car.wash();
    }
}
