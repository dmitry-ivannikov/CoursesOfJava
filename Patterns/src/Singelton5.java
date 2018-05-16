public class Singelton5 {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getSingeltone();
        Singelton singelton2 = Singelton.getSingeltone();
        singelton.i = 5;
        System.out.println(singelton2.i);
    }
}

class Singelton {
    int i = 0;
    static Singelton singeltone = new Singelton();
    private Singelton(){

    }

    public static Singelton getSingeltone() {
        return singeltone;
    }
}