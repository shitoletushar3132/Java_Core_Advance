package OOP.Inheritance;
public class Inheritance {
    // Inheritance = one class inherits the attributes and methods
    //              from one class.
    //               child <- parent

    //super = refers to the parent class used in constructors and method overriding
    //          calls the parent constructor to initialize attributes


    // Method overriding = when a subclass provides its own
    //                     implementation of a method that is already defined
    //                      allows for code reusability and give specific implementations.


    public static void main(String[] args) {
        Person person = new Person("tushar","shitole");

        Student studeent = new Student("Tushar","Shitole",8.38);

        studeent.showName();
//        person.showName();


        Dog dog = new Dog();
        Fist fish = new Fist();

        fish.move();

    }


}
