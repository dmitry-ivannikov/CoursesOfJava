import java.io.File;
public class NullObject25 {
    public static void main(String[] args){
        Animal animal =  getAnimal();
        animal.eat();
    }
    static Animal getAnimal(){
        try{
            if (new File("noFile.txt").exists()){
                return new Lion();
            }
        } finally {
            return new NoAnimal();
        }

    }
}

interface Animal{
    void eat();
}

class Lion implements Animal{
    @Override
    public void eat() {
        System.out.println("do something");
    }
}

class NoAnimal implements Animal{
    public void eat(){}
}
