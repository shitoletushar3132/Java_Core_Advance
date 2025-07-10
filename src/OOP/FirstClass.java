package OOP;

public class FirstClass {

    public static void main(String[] args) {
        // class = class is the blueprint for the objects

        // object = an entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type


        /*
        * constructor = A special method to initialize objects
        *               you can pass arguments to a constructor
        *               and set up initial values
        * */


        /*
        * Static = makes a variable or method belong to the class
        *           rather than to any specific object.
        *           Commonly used for utility methods or shared resources
        * */




//        Car car = new Car();

//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.price);
//        System.out.println(car.isRunning);
//        car.start();
//        car.stop();


        Student s1 = new Student("tushar",22,8.38,false);
//        s1.printStudentDetails();
//        s1.getGpa();


        Student s2 = new Student("vicky");
        s2.printStudentDetails();


    }
}
