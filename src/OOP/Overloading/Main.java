package OOP.Overloading;

public class Main {
    public static void main(String[] args) {


       A obj1 = new A(293);
       A obj2 = new A(3232);

        System.out.println(A.speedd);

       obj2.speedd=400;
       System.out.println(obj2.speedd);
       System.out.println(obj1.speedd);

    }
}
