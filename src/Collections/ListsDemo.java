package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // add method add a specified element to the collection.
        list.add(100);
        list.add(200);
        list.add(4000);

        list.add(1454);

        // return the number of element in the collections
//        System.out.println(list.size());
//
//        // contains check element present or not
//        System.out.println(list.contains(200));
//
//        //remove element or remove from index
//        list.remove(1);
//        System.out.println(list);
//
//        list.remove((Integer)4000);
//        System.out.println(list);


        List<Integer > list2 = new ArrayList<>();
        list2.add(121);
        list2.add(123);
        list2.add(125);
        list2.add(126);
        list2.add(128);

        System.out.println(list2);

        list2.add(1,119);
        System.out.println(list2);

        list2.set(1,900);
        System.out.println(list2);

        list.remove(1);


        System.out.println(list2.get(0));
        System.out.println(list2.indexOf(128));

        // different way to iterate over that list
        for(int num : list2){
            System.out.print(num+" ");
        }

        Iterator<Integer> Ir = list2.iterator();
        while(Ir.hasNext()){
            System.out.println("Iterator: "+Ir.next());
        }


        // sublist
        System.out.println(list2.subList(1,3));



    }
}
