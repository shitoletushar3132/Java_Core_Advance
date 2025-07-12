package OOPS;

public class Student {
    // Properties/field/instance variable & behaviour
    private String name;
    private int rollNumber;
    private int age;

    public void setAge(int age){
        if(age<0){
            this.age=0;
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
