package ExceptionsHandling;

public class Voter {

    public void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be greater that 18+");
        }
    }
}
