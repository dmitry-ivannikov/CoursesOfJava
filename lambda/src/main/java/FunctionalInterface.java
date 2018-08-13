import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 5;
//            }
//        };

        Predicate<Integer> predicate = x -> x > 5; //return boll для проверки условий
        System.out.println(predicate.test(3));

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(2);// //return void, сделать некоторое действие

        Function<Integer, String> function = x -> x.toString(); // функция перехода от одного объекта типа Т к объекту типа R

        Supplier<Integer> supplier = () -> new Integer(5);// возвращает объект некоего типа, инициализация

        UnaryOperator<Integer> unaryOperator = x -> x * x; //Приняли объект типа Т, сделали над ним действия, вернули объект типа Т

        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y; // приналя 2 объекта типа Т произвели над ними действие и вернули некий рехультативный объект Т

        MyPredicate<Integer> myPredicate = x -> System.out.println(x);
        myPredicate.apply(5);
    }
}

interface MyPredicate<T>{
    void apply(T t);
}
