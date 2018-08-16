import java.util.function.Supplier;
import java.util.stream.Stream;

public class MoreLambda {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("a", "b", "c");
//        stream.map(s -> {
//            System.out.println("map " + s);
//            return s.toLowerCase();
//        }).map(s -> {
//            System.out.println("map 2 " + s);
//            return s.toUpperCase();
//        }).forEach(s -> System.out.println(s));


//        Stream<String> stream = Stream.of("a", "b", "c");
//        stream.forEach(s -> System.out.println(s));
//        stream.forEach(s -> System.out.println(s));//nizya
//
//        Supplier<Stream<String>> supplier = () -> Stream.of("a", "b", "c");
//        supplier.get().forEach(s -> System.out.println(s));
//        supplier.get().forEach(s -> System.out.println(s));//mozna

//        Stream<String> stream = Stream.of("a", "b", "c");
//        stream.parallel().map( s -> {
//            System.out.println("map: " + s + " " + Thread.currentThread().getName());
//            return s;
//        }).map( s -> {
//            System.out.println("map2: " + s + " " + Thread.currentThread().getName());
//            return s;
//        }).forEach(s -> System.out.println(s));

        Stream<String> stream = Stream.of("a", "b", "c");
        stream.parallel().sorted( (s1, s2) ->{
                System.out.println("sort + s" + s1 + s2);
                return s1.compareTo(s2);
        }).map( s -> {
            System.out.println("map: " + s + " " + Thread.currentThread().getName());
            return s;
        }).map( s -> {
            System.out.println("map2: " + s + " " + Thread.currentThread().getName());
            return s;
        }).forEach(s -> System.out.println(s));

    }
}
