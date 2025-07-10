package OOP;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 580000.23;
    boolean isRunning = false;

    void start(){
        this.isRunning = true;
        System.out.println("You Start the enging");
    }

    void stop(){
        this.isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the "+ model);

    }

    void brake(){
        System.out.println("You break the "+this.model);
    }


    //getters
    String getModel(){
        return this.model;
    }

    String getMake(){
        return this.make;
    }

    //setters
    void setPrice(int price){
        this.price = price;
    }

    //

}
