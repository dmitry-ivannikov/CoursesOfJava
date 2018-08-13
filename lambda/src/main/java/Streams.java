import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Streams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

//        for (String s : list){
//            System.out.println(s);
//        }
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        Stream<String> stream = list.stream();
//        stream.forEach(x -> System.out.println(x));
//        stream = list.stream();
//        stream.forEach(x -> System.out.println(x));

//        list.stream().forEach(x -> System.out.println(x));

//        list.stream().filter(x -> {
//            //System.out.println(x);
//            return x.equals("one");
//        }).count();


//        List list1 = list.stream().filter(x -> x.equals("two")).collect(Collectors.toList());
//        list1.stream().forEach( x -> System.out.println(x));

       // Set<String> set = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());

        //list.stream().map(x -> x.toUpperCase());

        //Stream.of(asList("one", "two"), asList("three", "four")).flatMap(x -> x.stream());

//        int value = Stream.of(1, 2).min(Comparator.comparing(x -> x)).get();
//        int value2 = Stream.of(1, 2).max(Comparator.comparing(x -> x)).get();



//        int counter = 0;
//        for(int element : new int []{1, 2, 3}){
//            counter += element;
//        }
//
//        int count = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);

        Stream.of("one", "two").sorted().collect(Collectors.toList());
        Stream.of("one", "two").limit(1).collect(Collectors.toList());//дай первое
        Stream.of("one", "one").distinct().collect(Collectors.toList());// если повторяются, выведи одно
        Stream.of("one", "two").skip(1).collect(Collectors.toList());

        Stream.of("one", "two").filter(x -> x.equals("one")).findAny().get();
        Stream.of("one", "two").filter(x -> x.equals("one")).findFirst().get();
        Stream.of(1, 2).mapToInt(x -> x).sum();//int - 4 bite, Integer - 16

        IntStream intStream = Stream.of(1, 2).mapToInt(x -> x);
        intStream.summaryStatistics().getAverage();// дай минимальный, максимальный, вообщем что захочешь
        Stream.of("one", "two").peek(x -> x.toUpperCase()).findFirst().get();
    }
}
