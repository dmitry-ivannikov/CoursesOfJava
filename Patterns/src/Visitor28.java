import sun.reflect.generics.visitor.Visitor;

public class Visitor28 {
    public static void main(String[] args){
        Animall animal = new Dog();
        animal.doJpb(new ConcreteVisitor());

    }
}

interface Animall{
    void doJpb(Visitorr visitor);
}

class Dog implements Animall{
    @Override
    public void doJpb(Visitorr visitor) {
        visitor.doDog();
    }
}

class Cat implements Animall{
    @Override
    public void doJpb(Visitorr visitor) {
        visitor.doCat();
    }
}

interface Visitorr{
    void doDog();
    void doCat();
}
class ConcreteVisitor implements Visitorr{
    @Override
    public void doDog() {
        System.out.println("Haw");
    }

    @Override
    public void doCat() {
        System.out.println("mau");
    }

}
