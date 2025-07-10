package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // 1.collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //2 forEach
        list.stream().forEach(x-> System.out.println(x));

        //3. reduce: Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y)->x+y);
        System.out.println(optionalInteger.get());

        //4 count

        //5. anyMatch, allMatch, noneMatch
        boolean b= list.stream().anyMatch(x->x%2 == 0);
        System.out.println(b);

        boolean a= list.stream().allMatch(x->x%2 == 0);
        System.out.println(a);

        //6. findFirst, findany


        //Eg : Filtering and collecting names
        List<String> names = Arrays.asList("anna","bob","Charlie","David");
        System.out.println(names.stream().filter(x->x.length()>3).toList());

        //Eg. Squareing and sorting numbers
        List<Integer> number = Arrays.asList(1,23,4,4,54,3);
        System.out.println(number.stream().map(x->x*x).sorted().toList());

        //e.g summing values
        int num[] = {1,2,3,4,5};
        System.out.println(Arrays.stream(num).reduce(Integer::sum));

        // E.g Counting Occurrences of a character
        String sentence = "Hello world";
        char[] characters = sentence.toCharArray();
        System.out.println(sentence.chars().filter(x->x=='l').count());

        // stateful and stateless operation

        //lazy
    }
}
