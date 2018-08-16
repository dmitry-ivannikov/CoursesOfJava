public class Single{
    public static void main(String[] args) {
        System.out.println("sdfsdf");
    }
}

//class Employee{
//    int getSalary(){return 10;}
//    void cook(){}
//    void cleanFloor(){}
//    void deliverFood(){}
//}

class Employee{
    int getSalary(){return 10;}
}

class Cook extends Employee{
    void cook(){}
}
class Janitor extends Employee{
    void claenFloor(){}
}

class EmployeeFacade{
    Cook cook = new Cook();
    Janitor janitor = new Janitor();
    void cook(){
        cook.cook();
    }
    void cleanFloor(){
        janitor.claenFloor();
    }
}