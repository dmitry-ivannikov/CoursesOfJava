import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Collector {
    public static void main(String[] args) {
        Stream.of("one", "two").collect(Collectors.toList());//не понятно в какаой лист
        Stream.of("one", "two").collect(Collectors.toCollection(ArrayList::new));// теперь понятно

        //Stream.of("one", "two").collect(maxBy(Comparator.comparing(x -> x)));

        Map<Boolean, List<Integer>> map = Stream.of(1, 2, 3, 4).collect(partitioningBy(x -> x > 2));// мап с 1 0 по условию что больше 2

        Map<Boolean, List<Integer>> map2 = Stream.of(1, 2, 3, 4).collect(groupingBy(x -> x > 2));

        String result = Stream.of("one", "two", "three").collect(joining(",", "{", "}"));

        Map<Integer, Long> map1 = Stream.of(1, 2, 3, 4).collect(groupingBy(x -> x, counting()));
        System.out.println(map1.get(1));
    }
}
