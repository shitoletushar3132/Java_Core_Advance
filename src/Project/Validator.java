package Project;

import java.util.function.Predicate;

public class Validator {

    public static boolean isAdult(User user){
        return user.getAge() >= 18;
    }

    public static boolean hasValidEmail(User user){
        return  user.getEmail() != null && user.getEmail().contains("@");
    }

    public static boolean validateUser(User user, Predicate<User> predicate){
        return  predicate.test(user);
    }
}
