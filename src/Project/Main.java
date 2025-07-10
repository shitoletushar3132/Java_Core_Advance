package Project;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Tushar", 20, "tushar@example.com"),
                new User("Ravi", 16, "ravi[at]example.com"),
                new User("Priya", 25, "priya@gmail.com"),
                new User("Kiran", 17, "kiran123@gmail.com")
        );

        System.out.println("Valid Adult Users with valid Email: ");

        users.stream()
                .filter((user)->Validator.isAdult(user))
                .filter((user)->Validator.hasValidEmail(user))
                .forEach((user)-> System.out.println(user));
    }
}
