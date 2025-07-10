package OOP.Composition;

public class Main {
    public static void main(String[] args) {
        // composition = Represents a "Part-of" relationship between objects.
        //              for example, an Engine is "part of" a car.
        //              Allows complex objects to be constructed from similar objects.

        Car car = new Car("Alto",2010, "800CC");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

    }
}
