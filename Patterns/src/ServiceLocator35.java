import java.util.ArrayList;
import java.util.List;

public class ServiceLocator35 {
    public static void main(String[] args) {
        Servicee servicee = SrviceLocator.getServisee("Service1");
        servicee.execute();
        servicee = SrviceLocator.getServisee("Service2");
        servicee.execute();
    }
}
interface Servicee{
    String getName();
    void execute();
}

class Service1 implements Servicee{
    @Override
    public void execute() {
        System.out.println("Executing service1");
    }

    @Override
    public String getName() {
        return "Srvice1";
    }
}
class Service2 implements Servicee{
    @Override
    public void execute() {
        System.out.println("Executing service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}

class InitialContext {
    public Object lookup(String jndiName){
        if (jndiName.equalsIgnoreCase("SERVICE1")){
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")){
            return new Service2();
        }
        return null;
    }
}
class Cache{
    private List<Servicee> servicees = new ArrayList<>();
    public Servicee getServicee(String serviseName){
        for(Servicee servicee : servicees){
            if (servicee.getName().equalsIgnoreCase(serviseName)){
                System.out.println("Return cached " + serviseName + " object");
            }
        }
        return null;
    }
    public void addService(Servicee newService){
        boolean exists = false;
        for(Servicee servicee : servicees){
            if (servicee.getName().equalsIgnoreCase(newService.getName())){
                exists = false;
            }
        }
        if(!exists){
            servicees.add(newService);
        }
    }
}
class SrviceLocator{
    private static Cache cache = new Cache();
    public static Servicee getServisee(String jndiName){
        Servicee servicee = cache.getServicee(jndiName);
        if (servicee != null){
            return servicee;
        }
        InitialContext context = new InitialContext();
        Servicee servicee1 = (Servicee)context.lookup(jndiName);
        cache.addService(servicee1);
        return servicee1;
    }
}