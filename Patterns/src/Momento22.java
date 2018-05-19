public class Momento22 {
    public static void main(String[] args){
        Originator originatir = new Originator();
        originatir.setState("one");
        CareTraker careTraker = new CareTraker();
        careTraker.setMomento(originatir.createMomento());
        originatir.setState("two");
        originatir.getDataMomento(careTraker.getMomento());
        System.out.println(originatir.getState());
    }
}

class CareTraker{
    Momento momento;

    public Momento getMomento() {
        return momento;
    }

    public void setMomento(Momento momento) {
        this.momento = momento;
    }
}

class Originator {
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Momento createMomento(){
        return new Momento();
    }
    void getDataMomento(Momento momento){
        this.state = momento.getState();
    }
}

class Momento{
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
