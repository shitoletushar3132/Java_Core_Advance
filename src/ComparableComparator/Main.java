package ComparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Animal implements Comparable<Animal>{
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        if(this.age == o.age){
            return  this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(4,"leo",10);
        Animal a2 = new Animal(2,"Bruna",5);

        Animal a3 = new Animal(8,"Max",9);

        Animal a4 = new Animal(1,"Don",6);

        List<Animal> dogs = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));

        System.out.println(dogs);

//        dogs.sort();

        Collections.sort(dogs, (a,b)-> Integer.compare(a.age,b.age) );
        Collections.sort(dogs, (a,b)-> a.name.compareTo(b.name) );

        System.out.println(dogs);


    }
}
