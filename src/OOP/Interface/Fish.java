package OOP.Interface;

public class Fish implements Prey,Praditor{

    @Override
    public void flee(){
        System.out.println("The fish is swimming aways");
    }

    @Override
    public void hunt(){
        System.out.println("the fish is hunting");
    }

}
