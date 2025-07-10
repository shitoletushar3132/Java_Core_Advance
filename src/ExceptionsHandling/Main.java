package ExceptionsHandling;

public class Main {

    public static void main(String[] args) {
        Voter v = new Voter();
        String t = "Tushar";
        try{
            v.checkAge(32);
            System.out.println(t.toLowerCase());
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

}
