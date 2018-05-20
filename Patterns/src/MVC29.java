public class MVC29 {
    public static void main(String[] args){
        Controller controller = new Controller();
        controller.execute();
    }
}

class SStudent{
    String name = "DD";
    int age = 20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface ModelLayer{
    SStudent getSS();
}

class DBLayer implements ModelLayer{
    @Override
    public SStudent getSS() {
        return new SStudent();
    }
}

interface View{
    void showStudent(SStudent sStudent);
}

class ConsoleVie implements View{
    @Override
    public void showStudent(SStudent sStudent) {
        System.out.println("Stident " + sStudent.getName() + " age " + sStudent.getAge());
    }
}
class Controller{
    ModelLayer modelLayer = new DBLayer();
    View view = new ConsoleVie();
    void execute(){
        SStudent sStudent = modelLayer.getSS();
        view.showStudent(sStudent);
    }
}