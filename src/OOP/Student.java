package OOP;

public class Student {
    private String name;
    private int age;
    private double gpa;
    private boolean isEnrolled;


    /*
     * constructor = A special method to initialize objects
     *               you can pass arguments to a constructor
     *               and set up initial values
     * */


    /*
    * OverLoaded Constructors = Allow a class to have multiple constructors
    *                           with different parameter lists
    *                           Enable objects to be initialized in various way
    * */

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    // Display student details
    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Is Enrolled: " + isEnrolled);
    }
}
