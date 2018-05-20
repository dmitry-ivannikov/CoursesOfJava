public class BusinessDelegate30 {
    public static void main(String[] args){

    }
}

interface BusinessServase{
    void doJob();
}

class EJBSrbvise implements BusinessServase{
    @Override
    public void doJob() {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.doTask("ejb");
    }
}
class JMService implements BusinessServase{
    @Override
    public void doJob() {
        System.out.println("do jms job");
    }
}
class LookupServise{
    BusinessServase getService(String seerviceType){
        if(seerviceType.equals("ejb")){
            return new EJBSrbvise();
        } else {
            return new JMService();
        }
    }
}

class BusinessDelegate{
    LookupServise lookupServise = new LookupServise();
    BusinessServase businessServase;
    void doTask(String serviceType){
        businessServase = lookupServise.getService(serviceType);
        businessServase.doJob();
    }
}