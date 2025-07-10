package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps  {

    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked
        // means we do a some terminal operations like count(), collect() only then that stream will be execute


        // 1. filter
        List<String> list = Arrays.asList("ts","vs","As");
        Stream<String> filterA= list.stream().filter(x->x.startsWith("A"));
        long res= list.stream().filter(x->x.startsWith("A")).count();
        System.out.println(res);


        //2.map
        Stream<String> upper =list.stream().map(String::toUpperCase);

        //3. sorted
        Stream<String>sorted = list.stream().sorted();
        Stream<String>sortedViaLength = list.stream().sorted((a,b)->a.length() - b.length());


        //4. distinct
        Long countOfDistinctA =  list.stream().filter(x->x.startsWith("A")).distinct().count();
        System.out.println(countOfDistinctA);

        //5.limit
        System.out.println( Stream.iterate(1,x->x+1).limit(23).count());

        // 6.skip
        System.out.println( Stream.iterate(1,x->x+1).skip(10).limit(23).count());


    }
}
