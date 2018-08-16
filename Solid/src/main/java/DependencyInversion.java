public class DependencyInversion {
    public static void main(String[] args) {

    }
}
interface DAO{
    void execute();
}

class DataAccess extends  DAO{
    public void execute(){
        System.out.println("execute");
    }
}



class Client{
    DAO dataAccess = new DataAccess();
    void doJob(){
        dataAccess.execute();
    }
}