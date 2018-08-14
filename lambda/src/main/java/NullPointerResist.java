import java.util.Optional;

public class NullPointerResist {
    public static void main(String[] args) {
        Optional <Streams> optional = Optional.empty();
        Optional <Streams> optiona2 = Optional.ofNullable(null);
        Optional<String> optiona3 = getO();

        Optional<String> optional3 = getO();
        if(optiona3.isPresent()){
            System.out.println(optiona3.get());
        }
        //System.out.println(optional3.get());

    }
    static Optional<String> getO(){
        if(false){
            return Optional.of("Hello");
        }
        return Optional.empty();
    }
}
