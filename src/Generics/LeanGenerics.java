package Generics;

public class LeanGenerics {


    // also we make a generic method without class
    static <T> void printData(T data){
        System.out.println(data);
    }

    // this is the example of bounded generic types where we can bound
    // generics for only the Number (Integer, Double, and so on)
    // means other data will not pass like string, other object
    static <T extends Number> void printNumber(T data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        Dog<String,Integer> d1 = new Dog("adaf");
        Dog<String,Integer> d2 = new Dog("kfa;sj");
        Dog<Integer,Integer> d3 = new Dog(12);
        printData(43);
        printNumber(34);
//        printNumber("34");

    }


}

class Dog<E,V> {
    E id;
    V name;

    public Dog(E id){
        this.id = id;
    }
}
