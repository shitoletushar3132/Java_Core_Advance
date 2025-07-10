package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // streams
        // java 8--> minimal code, functional programing
        // java 8 --> lambda expression, streams, Date & time Api

        // lambda expression
        // lambda  expression is an anonymous function (no name, no return type, no access modifier)

        Thread t1 = new Thread(()-> System.out.println("hello"));
        t1.run();

//        MathOperation addition = new MathOperation() {
//            @Override
//            public int operate(int a, int b) {
//                return 0;
//            }
//        };


        MathOperation addition = (a,b)-> a+b;
        System.out.println(addition.operate(1,2));

        // Predicate --> functional interface (boolean valued function)
        Predicate<Integer> predicate = (x)-> x%2 ==0;
        System.out.println(predicate.test(4));


        Predicate<String> isWordStartWithA= (str)-> str.charAt(0) == 'A';//this lambda function is a test method
        System.out.println(isWordStartWithA.test("bbhi"));


        // function --> work for you
        Function<Integer,Integer> square  = x->x*x;
        Function<Integer, Integer> cube = x->x+10;
        System.out.println(cube.andThen(square).apply(2)); // 144 first add then square
        System.out.println(cube.compose(square).apply(2)); // 14 first square then add
        System.out.println(square.apply(20));

        //Consumer
        Consumer<Integer> print = (x)-> System.out.println(x);
        print.accept(543);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x->{
            for(int i :x){
                System.out.print(i+" ");
            }
        };
        printList.accept(list);

        // Supplier
        Supplier<Integer> giveRandomNumber = ()-> (int)(Math.random()*100);
        System.out.println(giveRandomNumber.get());



        //BiPredicate, BiConsumer, BiFunction
        BiPredicate<Integer,Integer> isSumEven = (x,y)->(x+y)%2==0;

        System.out.print(isSumEven.test(1,3));



        // Method Reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram","Shyam","Ghan");
        students.forEach(x-> System.out.println(x));
        students.forEach(System.out::println);

        // constructor reference
        List<String> names = Arrays.asList("A","B","C");
        List<MobilePhone> mobileList = names.stream()
                .map(MobilePhone::new)
                .collect(Collectors.toList());

        mobileList.forEach(mobile -> System.out.println(mobile.getName()));
    }
}


class MobilePhone{
    String name;
    public MobilePhone(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}
@FunctionalInterface
interface MathOperation{
    int operate(int a,int b);
}
