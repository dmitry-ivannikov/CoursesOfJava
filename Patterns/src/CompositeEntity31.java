public class CompositeEntity31 {
    public static void main(String[] args){
        CompositeEntity compositeEntity = new CompositeEntity();
        for (String s : compositeEntity.getData()){
            System.out.println(s);
        }
    }
}

class DependentObj1{
    String getData(){
        return "one";
    }
}
class DependentObj2{
    String getData(){
        return "two";
    }
}
class CoreGainedObj{
    DependentObj1 dependentObj1 = new DependentObj1();
    DependentObj2 dependentObj2 = new DependentObj2();
    public String[] getDaata(){
        return new String[]{dependentObj1.getData(), dependentObj2.getData()};
    }
}
class CompositeEntity{
    CoreGainedObj coreGainedObj = new CoreGainedObj();
    public String[] getData(){
        return coreGainedObj.getDaata();
    }
}