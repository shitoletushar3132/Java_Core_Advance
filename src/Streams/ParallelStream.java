package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large data sets
        // workload is distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x->x+1).limit(200000).toList();
        List<Long> factorialList = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000);

        startTime = System.currentTimeMillis();
        factorialList = list.parallelStream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000);


        //cumulative sum
        // [1,2,3,4,5] -> [1,3,6,10,15]
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        numbers.parallelStream().map(sum::addAndGet).toList();
    }

    private static long factorial(int n){
        long result = 1;
        for(int i=2; i<=n; i++){
            result *= i;
        }
        return  result;
    }
}
