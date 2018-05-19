import java.util.ArrayList;
import java.util.List;

public class Mediator21 {
    public static void main(String[] args){
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.add(new ConcreteCollegue(mediator, "one "));
        mediator.add(new ConcreteCollegue(mediator, "two "));
        ConcreteCollegue concreteCollegue = new ConcreteCollegue(mediator, "thre ");
        mediator.add(concreteCollegue);
        concreteCollegue.changeStatus();
    }
}

interface Mediator{
    void requestAll(Collegue collegue);
}

class ConcreteMediator implements Mediator{
    List<Collegue> collegues = new ArrayList<>();
    void add(Collegue collegue){
        collegues.add(collegue);
    }

    @Override
    public void requestAll(Collegue collegue) {
        collegue.setTrue();
        for(Collegue coll : collegues){
            if(coll != collegue){
                coll.setFalse();
            }
        }
    }
}

interface Collegue{
    void setFalse();
    void setTrue();
    void changeStatus();
}

class ConcreteCollegue implements Collegue{
    boolean status;
    Mediator mediator;
    String name;

    public ConcreteCollegue(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void setFalse() {
        status = false;
        System.out.println(name + "status if false");
    }

    @Override
    public void setTrue() {
        status = true;
        System.out.println(name + "status if true");
    }

    @Override
    public void changeStatus() {
        mediator.requestAll(this);
    }
}