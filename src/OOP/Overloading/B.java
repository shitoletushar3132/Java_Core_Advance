package OOP.Overloading;

public class B extends A {

    B(){
        super(32);
    }
    public void add(){
        System.out.println("Child");
    }

    public void printz(){
        System.out.println("B");
    }
}
