package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // process collections of data in a functional and declarative manner
        // simplify Data processing
        // Embrace Functional Programming
        // Improve Readability & Maintainability
        // Enable Easy Parallelism

        // what is stream?
        // a sequence of elements supporting functional and declarative programming.

        // how to use Streams?
        // Source, intermediate operations & terminal operation

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        //find even
        Long count = numbers.stream().filter(x->x%2==0).count();
        System.out.println(count);

        // Creating Streams
        // 1. From collections
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream = list.stream();

        //2. From Arrays
        String[] array = {"a","b","c"};
        Stream<String> stream1 =  Arrays.stream(array);

        //3 Using Stream.of()
        Stream<String> stream2 = Stream.of("a","b");

        //4. Infinite Streams
        Stream<Integer> generate = Stream.generate(()->1);
        Stream.iterate(1,x->x+1).limit(100).toList();

        // flatten the nested array (e.g lists within lists)
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("orange","green"),
                Arrays.asList("grapes", "pineapple")
        );

        System.out.println(listOfLists.stream().flatMap(x->x.stream().map(String::toUpperCase)).toList());

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatmap is useful"
        );
        System.out.println( sentences.stream()
                .flatMap(x->Arrays.stream(x.split(" "))
                        .map(String::toUpperCase)).toList());

        String state = "i love java";
        String [] arrState = state.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str:arrState){
            if(!str.isEmpty()){
                String capitalized = Character.toUpperCase(str.charAt(0))+str.substring(1);
                sb.append(capitalized).append(" ");
            }
        }
        System.out.println(sb.toString().trim());


    }
}
