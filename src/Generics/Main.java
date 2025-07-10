package Generics;

public class Main {
    public static void main(String[] args) {
        //Generics = A concept where you can write a class, interface or method
        //          that is compatible with different data types.
        //          <T> type Parameter (placeholder that gets replaced with a real type)
        //          <String> type argument (specifices the type)


        Box <String> box = new Box<String>();
        box.setItem("Tushar");
        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("apple",0.50);
        System.out.println(product.getItem());

    }
}
